let currentPage = 0;
let heartInterval = null;

/* Pages Data */
const pages = [
    {
        message: "You are my favorite notification 💖 ",
        image: "a1.jpg",
        music: "as.mpeg"
    },
    {
        message: "With you, life feels magical ✨",
        image: "a2.jpg",
        music: "m.mpeg"
    },
    {
        message: "You  are  my  noting  💖",
        image: "a3.png",
        music: "n.mpeg"
    },
    {
        message: "im  always  and  always yours  ✨",
        image: "gurl.png",
        music: "o.mpeg"
    },
    {
        message: "its  you  and  only  you ✨",
        image: ".jpg",
        music: "p.mpeg"
    },
    {
        message: "lorem20",
        image: "nothing to show ",
        music:"q.mp3"
    }
];

function handleLogin() {

    const user = document.getElementById('username').value;
    const pass = document.getElementById('password').value;
    const errorText = document.getElementById('error-message');

    if (user === "nimi" && pass === "2802") {

        document.getElementById('login-box').style.display = 'none';
        document.getElementById('welcome-box').style.display = 'block';

        showPage(0);
        startHearts();
        startFireworks();

        errorText.innerText = "";

    } else {
        errorText.innerText = "Invalid username or password!";
    }
}

/* Show Page With Cinematic Fade */
function showPage(index) {

    const container = document.getElementById("page-content");
    container.style.opacity = 0;

    setTimeout(() => {

        const page = pages[index];

        typeWriter(page.message);
        document.getElementById("page-image").src = page.image;

        crossFadeMusic(page.music);

        container.style.opacity = 1;

        if (index === pages.length - 1) {
            document.getElementById("next-btn").style.display = "none";
            document.getElementById("logout-btn").style.display = "inline-block";
        } else {
            document.getElementById("next-btn").style.display = "inline-block";
        }

    }, 500);
}

/* Next Page */
function nextPage() {
    currentPage++;
    if (currentPage < pages.length) {
        showPage(currentPage);
    }
}

/* Typewriter Effect */
function typeWriter(text) {

    const element = document.getElementById("page-message");
    element.innerText = "";
    let i = 0;

    const typing = setInterval(() => {
        element.innerText += text.charAt(i);
        i++;
        if (i >= text.length) clearInterval(typing);
    }, 50);
}

/* Play Music */
function crossFadeMusic(src) {

    const music = document.getElementById("bg-music");

    music.pause();
    music.src = src;
    music.volume = 1;
    music.play();
}

/* Floating Hearts */
function startHearts() {
    heartInterval = setInterval(() => {
        const heart = document.createElement("div");
        heart.className = "heart";
        heart.innerHTML = "❤️";
        heart.style.left = Math.random() * 100 + "vw";
        heart.style.fontSize = (Math.random() * 20 + 10) + "px";
        document.body.appendChild(heart);
        setTimeout(() => heart.remove(), 4000);
    }, 500);
}

/* Fireworks */
function startFireworks() {
    for (let i = 0; i < 30; i++) {
        const fire = document.createElement("div");
        fire.className = "firework";
        fire.style.left = Math.random() * 100 + "vw";
        fire.style.top = Math.random() * 100 + "vh";
        document.body.appendChild(fire);
        setTimeout(() => fire.remove(), 1000);
    }
}

/* Sparkle Cursor */
document.addEventListener("mousemove", function(e) {
    const sparkle = document.createElement("div");
    sparkle.className = "sparkle";
    sparkle.style.left = e.pageX + "px";
    sparkle.style.top = e.pageY + "px";
    document.body.appendChild(sparkle);
    setTimeout(() => sparkle.remove(), 600);
});

/* Auto Dark Mode */
const hour = new Date().getHours();
if (hour >= 19 || hour <= 6) {
    document.body.classList.add("dark");
}

/* Logout */
function logout() {
    location.reload();
}
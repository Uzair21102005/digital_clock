function updateClock() {
  const now = new Date();
  let h = now.getHours();
  const m = now.getMinutes();
  const s = now.getSeconds();
  const ampm = h >= 12 ? "PM" : "AM";

  // Convert to 12-hour format
  h = h % 12 || 12;

  // Update numeric display
  document.getElementById("hour").textContent = String(h).padStart(2, "0");
  document.getElementById("minute").textContent = String(m).padStart(2, "0");
  document.getElementById("second").textContent = String(s).padStart(2, "0");
  document.getElementById("ampm").textContent = ampm;

  // Rotate the dials
  document.querySelector(".seconds").style.transform = `rotate(${s * 6}deg)`;
  document.querySelector(".minutes").style.transform = `rotate(${m * 6}deg)`;
  document.querySelector(".hours").style.transform = `rotate(${h * 30}deg)`;
}

setInterval(updateClock, 1000);
updateClock();

import React from 'react';
import '../styles/ContactUs.css'; // Adjust path if in a 'styles' folder
import '@fortawesome/fontawesome-free/css/all.min.css'; // Import Font Awesome.

const ContactUs = () => {
  return (
    <div style={{ marginTop: "10px"}}>
    <div className="container">
      <div className="content">
        {/* Left Section */}
        <div className="left-side" style={{ marginLeft: "20px" }}>
          <div className="details" style={{ marginLeft: "100px" }}>
            <i className="fas fa-map-marker-alt"></i>
            <div className="topic">Our Address</div>
            <div className="text">Mumbai</div>
            <div className="text">Sharda Chowk</div>
          </div>
          <div className="details" style={{ marginLeft: "100px" }}>
            <i className="fas fa-phone"></i>
            <div className="topic">Phone</div>
            <div className="text">+91 98 9397 9695</div>
          </div>
          <div className="details" style={{ marginLeft: "100px" }}>
            <i className="fas fa-envelope"></i>
            <div className="topic">Email</div>
            <div className="text">sarthicare@gmail.com</div>
          </div>
          <div className="social-media">
            <a href="#" className="social-icon fb">
              <i className="fab fa-facebook-f"></i>
            </a>
            <a href="#" className="social-icon tw">
              <i className="fab fa-twitter"></i>
            </a>
            <a href="#" className="social-icon ig">
              <i className="fab fa-instagram"></i>
            </a>
            <a href="#" className="social-icon ln">
              <i className="fab fa-linkedin-in"></i>
            </a>
          </div>
        </div>

        {/* Right Section */}
        <div className="right-side">
          <div className="topic-text">Send us a message</div>
          <p>Get in Touch with Us – We're Here to Help!</p>
          <form action="#">
          <div style={{ marginBottom: "1px" }}>
            <input type="text" placeholder="Enter your name" required />
            </div>
            <div style={{ marginBottom: "1px" }}>
            <input type="email" placeholder="Enter your email" required />
            </div>
            <div className="phone-container" style={{ marginBottom: "1px" }}>
              <span className="phone-code">+91</span>
              <input
                type="tel"
                placeholder="Enter your phone number"
                maxLength="10"
                pattern="[0-9]{10}"
                title="Phone number must be 10 digits."
                required
              />
            </div>
            <div>
            <textarea placeholder="Enter your message" required></textarea>
            </div>
            <div className="button-container">
              <input type="submit" value="Send" />
              <input type="reset" value="Clear" />
            </div>
          </form>
        </div>
      </div>
    </div>
    </div>
  );
};

export default ContactUs;

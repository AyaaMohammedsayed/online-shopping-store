# Online Shopping Store

Welcome to the Online Shopping Store project! This project is designed to demonstrate an online shopping platform using Object-Oriented Programming (OOP) principles.

## Project Overview

The Online Shopping Store is a comprehensive e-commerce application built to provide a user-friendly interface for shopping. It includes functionalities for user management, product browsing, shopping cart operations, and order processing. The project leverages OOP to ensure scalability and maintainability.

## Features

### User Management

- **User Registration & Login**: Users can create accounts, log in, and manage their profiles.
- **Admin Panel**: Administrators have special access to manage products and view orders.

### Product Catalog

- **Product Listing**: Users can view available products with search and filter capabilities.
- **Product Details**: Detailed information for each product is available.
- **Category Browsing**: Products are organized into categories for easier navigation.

### Shopping Cart

- **Add/Remove Items**: Users can add or remove items from their shopping cart.
- **Update Quantity**: Users can modify the quantity of items in their cart.
- **View Cart**: Users can view the summary of items and the total price.

### Order Processing

- **Checkout**: Finalize purchases, including shipping and payment details.
- **Order Confirmation**: Confirmation of the order with tracking information.
- **Order History**: Users can view their past orders.

### Utilities

- **Database Management**: Manages data storage and retrieval.
- **Logging**: Captures system operations and errors for monitoring and debugging.

## OOP Design

### Key Classes

- **User**
  - **Attributes**: `username`, `password`, `email`, `address`
  - **Methods**: `register()`, `login()`, `updateProfile()`
  
- **Admin** (inherits from `User`)
  - **Methods**: `manageProducts()`, `viewOrders()`
  
- **Product**
  - **Attributes**: `productID`, `name`, `description`, `price`, `stockQuantity`
  - **Methods**: `updateStock()`, `applyDiscount()`
  
- **Cart**
  - **Attributes**: `cartItems` (list of `CartItem`)
  - **Methods**: `addItem()`, `removeItem()`, `updateQuantity()`
  
- **CartItem**
  - **Attributes**: `product`, `quantity`
  
- **Order**
  - **Attributes**: `orderID`, `user`, `orderItems` (list of `CartItem`), `totalAmount`, `status`
  - **Methods**: `processOrder()`, `updateStatus()`
  
- **Payment**
  - **Attributes**: `paymentID`, `amount`, `paymentMethod`
  - **Methods**: `processPayment()`
  
- **Shipping**
  - **Attributes**: `shippingID`, `address`, `trackingNumber`
  - **Methods**: `arrangeShipping()`, `trackOrder()`

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/AyaaMohammedsayed/online-shopping-store.git

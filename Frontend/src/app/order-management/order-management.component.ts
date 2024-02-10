import { Component } from '@angular/core';

@Component({
  selector: 'app-order-management',
  templateUrl: './order-management.component.html',
  styleUrl: './order-management.component.css'
})
export class OrderManagementComponent {
  orders: any[] = [
    { id: 1, customerName: 'Shaji', product: 'Paracetamol', status: 'Pending' },
    { id: 2, customerName: 'Shaji Ram', product: 'Inhaler ', status: 'Shipped' },
    { id: 3, customerName: 'Shaji Ram Prakash', product: 'Eye Drops', status: 'Delivered' }
  ];
  editingOrder: any = null;

  constructor() { }

  editOrder(order: any) {
    // Set the editingOrder object to the selected order for editing
    this.editingOrder = { ...order };
  }

  saveEditedOrder() {
    // Find the index of the editingOrder in the orders array
    const index = this.orders.findIndex(order => order.id === this.editingOrder.id);
    if (index !== -1) {
      // Update the order in the orders array
      this.orders[index] = { ...this.editingOrder };
      this.cancelEdit(); // Cancel editing after saving
    }
  }

  cancelEdit() {
    this.editingOrder = null; // Reset editingOrder
  }

  deleteOrder(orderId: number) {
    // Filter out the order with the specified orderId
    this.orders = this.orders.filter(order => order.id !== orderId);
  }
}
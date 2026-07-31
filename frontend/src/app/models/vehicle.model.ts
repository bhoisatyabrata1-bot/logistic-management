export interface Vehicle {
  id?: number;
  licensePlate: string;
  make: string;
  model: string;
  year: number;
  vin: string;
  vehicleType: string;
  capacityKg?: number;
  status: string;
  warehouseId?: number;
  createdAt?: Date;
  updatedAt?: Date;
}

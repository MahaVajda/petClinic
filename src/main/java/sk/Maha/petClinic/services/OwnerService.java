package sk.Maha.petClinic.services;

import sk.Maha.petClinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);
}

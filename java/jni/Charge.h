#pragma once
#include "types.h"
#include "Item.h"

namespace dgmpp {
	
	class Charge : public Item
	{
	public:
		Charge(std::shared_ptr<Engine> const& engine, TypeID typeID, std::shared_ptr<Item> const& owner);
		virtual ~Charge(void);
		std::shared_ptr<Charge> shared_from_this() {
			return std::static_pointer_cast<Charge>(Item::shared_from_this());
		}
		bool isAssistance();
		bool isOffensive();

		virtual Item* ship();
		virtual Item* character();
		virtual Item* other();
	protected:
	};
	
}
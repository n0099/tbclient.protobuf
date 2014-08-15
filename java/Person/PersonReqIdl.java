package tbclient.Person;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class PersonReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ PersonReqIdl(Builder builder, boolean z, PersonReqIdl personReqIdl) {
        this(builder, z);
    }

    private PersonReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<PersonReqIdl> {
        public DataReq data;

        public Builder(PersonReqIdl personReqIdl) {
            super(personReqIdl);
            if (personReqIdl != null) {
                this.data = personReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PersonReqIdl build(boolean z) {
            return new PersonReqIdl(this, z, null);
        }
    }
}

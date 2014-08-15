package tbclient.Person;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class PersonResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ PersonResIdl(Builder builder, boolean z, PersonResIdl personResIdl) {
        this(builder, z);
    }

    private PersonResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<PersonResIdl> {
        public DataRes data;
        public Error error;

        public Builder(PersonResIdl personResIdl) {
            super(personResIdl);
            if (personResIdl != null) {
                this.error = personResIdl.error;
                this.data = personResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PersonResIdl build(boolean z) {
            return new PersonResIdl(this, z, null);
        }
    }
}

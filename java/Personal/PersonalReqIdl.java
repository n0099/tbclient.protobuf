package tbclient.Personal;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class PersonalReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private PersonalReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<PersonalReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(PersonalReqIdl personalReqIdl) {
            super(personalReqIdl);
            if (personalReqIdl != null) {
                this.data = personalReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PersonalReqIdl build(boolean z) {
            return new PersonalReqIdl(this, z);
        }
    }
}

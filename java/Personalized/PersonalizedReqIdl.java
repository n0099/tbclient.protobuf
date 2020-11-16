package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class PersonalizedReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private PersonalizedReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<PersonalizedReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(PersonalizedReqIdl personalizedReqIdl) {
            super(personalizedReqIdl);
            if (personalizedReqIdl != null) {
                this.data = personalizedReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PersonalizedReqIdl build(boolean z) {
            return new PersonalizedReqIdl(this, z);
        }
    }
}

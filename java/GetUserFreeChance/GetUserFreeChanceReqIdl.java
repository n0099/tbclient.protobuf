package tbclient.GetUserFreeChance;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetUserFreeChanceReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetUserFreeChanceReqIdl(Builder builder, boolean z, GetUserFreeChanceReqIdl getUserFreeChanceReqIdl) {
        this(builder, z);
    }

    private GetUserFreeChanceReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetUserFreeChanceReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetUserFreeChanceReqIdl getUserFreeChanceReqIdl) {
            super(getUserFreeChanceReqIdl);
            if (getUserFreeChanceReqIdl != null) {
                this.data = getUserFreeChanceReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetUserFreeChanceReqIdl build(boolean z) {
            return new GetUserFreeChanceReqIdl(this, z, null);
        }
    }
}

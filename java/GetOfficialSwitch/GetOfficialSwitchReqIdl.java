package tbclient.GetOfficialSwitch;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes3.dex */
public final class GetOfficialSwitchReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetOfficialSwitchReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<GetOfficialSwitchReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetOfficialSwitchReqIdl getOfficialSwitchReqIdl) {
            super(getOfficialSwitchReqIdl);
            if (getOfficialSwitchReqIdl != null) {
                this.data = getOfficialSwitchReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetOfficialSwitchReqIdl build(boolean z) {
            return new GetOfficialSwitchReqIdl(this, z);
        }
    }
}

package tbclient.GetHorseRaceLampList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class GetHorseRaceLampListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetHorseRaceLampListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GetHorseRaceLampListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetHorseRaceLampListReqIdl getHorseRaceLampListReqIdl) {
            super(getHorseRaceLampListReqIdl);
            if (getHorseRaceLampListReqIdl != null) {
                this.data = getHorseRaceLampListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetHorseRaceLampListReqIdl build(boolean z) {
            return new GetHorseRaceLampListReqIdl(this, z);
        }
    }
}

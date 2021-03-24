package tbclient.GetHorseRaceLampList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetHorseRaceLampListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetHorseRaceLampListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetHorseRaceLampListResIdl getHorseRaceLampListResIdl) {
            super(getHorseRaceLampListResIdl);
            if (getHorseRaceLampListResIdl == null) {
                return;
            }
            this.error = getHorseRaceLampListResIdl.error;
            this.data = getHorseRaceLampListResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetHorseRaceLampListResIdl build(boolean z) {
            return new GetHorseRaceLampListResIdl(this, z);
        }
    }

    public GetHorseRaceLampListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}

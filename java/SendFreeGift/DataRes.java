package tbclient.SendFreeGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_FREE_CHANCE = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer free_chance;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer free_chance;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.free_chance = dataRes.free_chance;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.free_chance;
            if (num == null) {
                this.free_chance = DEFAULT_FREE_CHANCE;
                return;
            } else {
                this.free_chance = num;
                return;
            }
        }
        this.free_chance = builder.free_chance;
    }
}

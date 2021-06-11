package tbclient.AddLotteryCount;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_ENABLE_GET_CHANCE = 0;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer enable_get_chance;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer enable_get_chance;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.enable_get_chance = dataRes.enable_get_chance;
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
            Integer num = builder.enable_get_chance;
            if (num == null) {
                this.enable_get_chance = DEFAULT_ENABLE_GET_CHANCE;
                return;
            } else {
                this.enable_get_chance = num;
                return;
            }
        }
        this.enable_get_chance = builder.enable_get_chance;
    }
}

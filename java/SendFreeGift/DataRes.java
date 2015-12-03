package tbclient.SendFreeGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_FREE_CHANCE = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer free_chance;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.free_chance == null) {
                this.free_chance = DEFAULT_FREE_CHANCE;
                return;
            } else {
                this.free_chance = builder.free_chance;
                return;
            }
        }
        this.free_chance = builder.free_chance;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer free_chance;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.free_chance = dataRes.free_chance;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}

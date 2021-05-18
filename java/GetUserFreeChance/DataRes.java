package tbclient.GetUserFreeChance;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_FREE_CHANCE = 0;
    public static final Integer DEFAULT_SCENE_ID = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer free_chance;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer scene_id;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer free_chance;
        public Integer scene_id;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.free_chance = dataRes.free_chance;
            this.scene_id = dataRes.scene_id;
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
            } else {
                this.free_chance = num;
            }
            Integer num2 = builder.scene_id;
            if (num2 == null) {
                this.scene_id = DEFAULT_SCENE_ID;
                return;
            } else {
                this.scene_id = num2;
                return;
            }
        }
        this.free_chance = builder.free_chance;
        this.scene_id = builder.scene_id;
    }
}

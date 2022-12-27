package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class GameCodeList extends Message {
    public static final String DEFAULT_CLAIMED_VALUE = "";
    public static final String DEFAULT_LABEL = "";
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer begin_time;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer claimed_status;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String claimed_value;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer end_time;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer item_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String label;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer list_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_LIST_ID = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_BEGIN_TIME = 0;
    public static final Integer DEFAULT_END_TIME = 0;
    public static final Integer DEFAULT_ITEM_ID = 0;
    public static final Integer DEFAULT_CLAIMED_STATUS = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GameCodeList> {
        public Integer begin_time;
        public Integer claimed_status;
        public String claimed_value;
        public Integer end_time;
        public Integer item_id;
        public String label;
        public Integer list_id;
        public Integer type;

        public Builder() {
        }

        public Builder(GameCodeList gameCodeList) {
            super(gameCodeList);
            if (gameCodeList == null) {
                return;
            }
            this.list_id = gameCodeList.list_id;
            this.type = gameCodeList.type;
            this.label = gameCodeList.label;
            this.begin_time = gameCodeList.begin_time;
            this.end_time = gameCodeList.end_time;
            this.item_id = gameCodeList.item_id;
            this.claimed_status = gameCodeList.claimed_status;
            this.claimed_value = gameCodeList.claimed_value;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GameCodeList build(boolean z) {
            return new GameCodeList(this, z);
        }
    }

    public GameCodeList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.list_id;
            if (num == null) {
                this.list_id = DEFAULT_LIST_ID;
            } else {
                this.list_id = num;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            String str = builder.label;
            if (str == null) {
                this.label = "";
            } else {
                this.label = str;
            }
            Integer num3 = builder.begin_time;
            if (num3 == null) {
                this.begin_time = DEFAULT_BEGIN_TIME;
            } else {
                this.begin_time = num3;
            }
            Integer num4 = builder.end_time;
            if (num4 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = num4;
            }
            Integer num5 = builder.item_id;
            if (num5 == null) {
                this.item_id = DEFAULT_ITEM_ID;
            } else {
                this.item_id = num5;
            }
            Integer num6 = builder.claimed_status;
            if (num6 == null) {
                this.claimed_status = DEFAULT_CLAIMED_STATUS;
            } else {
                this.claimed_status = num6;
            }
            String str2 = builder.claimed_value;
            if (str2 == null) {
                this.claimed_value = "";
                return;
            } else {
                this.claimed_value = str2;
                return;
            }
        }
        this.list_id = builder.list_id;
        this.type = builder.type;
        this.label = builder.label;
        this.begin_time = builder.begin_time;
        this.end_time = builder.end_time;
        this.item_id = builder.item_id;
        this.claimed_status = builder.claimed_status;
        this.claimed_value = builder.claimed_value;
    }
}

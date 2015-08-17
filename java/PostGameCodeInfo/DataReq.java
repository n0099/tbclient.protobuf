package tbclient.PostGameCodeInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer game_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer kaifu_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer recommend_platform;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer user_id;
    public static final Integer DEFAULT_RECOMMEND_PLATFORM = 0;
    public static final Integer DEFAULT_USER_ID = 0;
    public static final Integer DEFAULT_GAME_ID = 0;
    public static final Integer DEFAULT_KAIFU_ID = 0;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.recommend_platform == null) {
                this.recommend_platform = DEFAULT_RECOMMEND_PLATFORM;
            } else {
                this.recommend_platform = builder.recommend_platform;
            }
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.game_id == null) {
                this.game_id = DEFAULT_GAME_ID;
            } else {
                this.game_id = builder.game_id;
            }
            if (builder.game_id == null) {
                this.kaifu_id = DEFAULT_KAIFU_ID;
                return;
            } else {
                this.kaifu_id = builder.kaifu_id;
                return;
            }
        }
        this.common = builder.common;
        this.recommend_platform = builder.recommend_platform;
        this.user_id = builder.user_id;
        this.game_id = builder.game_id;
        this.kaifu_id = builder.kaifu_id;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Integer game_id;
        public Integer kaifu_id;
        public Integer recommend_platform;
        public Integer user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.recommend_platform = dataReq.recommend_platform;
                this.user_id = dataReq.user_id;
                this.game_id = dataReq.game_id;
                this.kaifu_id = dataReq.kaifu_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}

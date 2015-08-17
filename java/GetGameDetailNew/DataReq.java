package tbclient.GetGameDetailNew;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_GAME_ID = "";
    public static final Integer DEFAULT_RECOMMEND_PLATFORM = 0;
    @ProtoField(tag = 3)
    public final CommonReq common;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String game_id;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer recommend_platform;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.game_id == null) {
                this.game_id = "";
            } else {
                this.game_id = builder.game_id;
            }
            if (builder.recommend_platform == null) {
                this.recommend_platform = DEFAULT_RECOMMEND_PLATFORM;
            } else {
                this.recommend_platform = builder.recommend_platform;
            }
            this.common = builder.common;
            return;
        }
        this.game_id = builder.game_id;
        this.recommend_platform = builder.recommend_platform;
        this.common = builder.common;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public String game_id;
        public Integer recommend_platform;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.game_id = dataReq.game_id;
                this.recommend_platform = dataReq.recommend_platform;
                this.common = dataReq.common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}

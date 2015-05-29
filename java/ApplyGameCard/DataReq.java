package tbclient.ApplyGameCard;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_GAME_ID = "";
    @ProtoField(tag = 4)
    public final CommonReq common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String game_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long kaifu_id;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long user_id;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_KAIFU_ID = 0L;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.game_id == null) {
                this.game_id = "";
            } else {
                this.game_id = builder.game_id;
            }
            if (builder.kaifu_id == null) {
                this.kaifu_id = DEFAULT_KAIFU_ID;
            } else {
                this.kaifu_id = builder.kaifu_id;
            }
            this.common = builder.common;
            return;
        }
        this.user_id = builder.user_id;
        this.game_id = builder.game_id;
        this.kaifu_id = builder.kaifu_id;
        this.common = builder.common;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public String game_id;
        public Long kaifu_id;
        public Long user_id;

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.user_id = dataReq.user_id;
                this.game_id = dataReq.game_id;
                this.kaifu_id = dataReq.kaifu_id;
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

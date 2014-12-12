package tbclient.AddMyGameBatch;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_GAME_ID = "";
    public static final Integer DEFAULT_INIT = 0;
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String game_id;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer init;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.game_id == null) {
                this.game_id = "";
            } else {
                this.game_id = builder.game_id;
            }
            if (builder.init == null) {
                this.init = DEFAULT_INIT;
                return;
            } else {
                this.init = builder.init;
                return;
            }
        }
        this.common = builder.common;
        this.game_id = builder.game_id;
        this.init = builder.init;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public String game_id;
        public Integer init;

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.game_id = dataReq.game_id;
                this.init = dataReq.init;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}

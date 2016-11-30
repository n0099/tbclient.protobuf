package tbclient.Acrossforum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CALL_FROM = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Integer DEFAULT_NEED_NUM = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String call_from;
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer need_num;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.call_from == null) {
                this.call_from = "";
            } else {
                this.call_from = builder.call_from;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.need_num == null) {
                this.need_num = DEFAULT_NEED_NUM;
                return;
            } else {
                this.need_num = builder.need_num;
                return;
            }
        }
        this.common = builder.common;
        this.call_from = builder.call_from;
        this.forum_name = builder.forum_name;
        this.need_num = builder.need_num;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String call_from;
        public CommonReq common;
        public String forum_name;
        public Integer need_num;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.call_from = dataReq.call_from;
                this.forum_name = dataReq.forum_name;
                this.need_num = dataReq.need_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}

package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CHATROOM_NEW_MSG = "";
    public static final String DEFAULT_DATA_TYPE = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_UNIQ_ID = "";
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long chatroom_id;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer chatroom_mask;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String chatroom_new_msg;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1438common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String data_type;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String uniq_id;
    public static final Long DEFAULT_FID = 0L;
    public static final Long DEFAULT_CHATROOM_ID = 0L;
    public static final Integer DEFAULT_CHATROOM_MASK = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Long chatroom_id;
        public Integer chatroom_mask;
        public String chatroom_new_msg;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1439common;
        public String data_type;
        public Long fid;
        public String forum_name;
        public String uniq_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1439common = dataReq.f1438common;
            this.data_type = dataReq.data_type;
            this.chatroom_new_msg = dataReq.chatroom_new_msg;
            this.fid = dataReq.fid;
            this.chatroom_id = dataReq.chatroom_id;
            this.uniq_id = dataReq.uniq_id;
            this.forum_name = dataReq.forum_name;
            this.chatroom_mask = dataReq.chatroom_mask;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1438common = builder.f1439common;
            String str = builder.data_type;
            if (str == null) {
                this.data_type = "";
            } else {
                this.data_type = str;
            }
            String str2 = builder.chatroom_new_msg;
            if (str2 == null) {
                this.chatroom_new_msg = "";
            } else {
                this.chatroom_new_msg = str2;
            }
            Long l = builder.fid;
            if (l == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l;
            }
            Long l2 = builder.chatroom_id;
            if (l2 == null) {
                this.chatroom_id = DEFAULT_CHATROOM_ID;
            } else {
                this.chatroom_id = l2;
            }
            String str3 = builder.uniq_id;
            if (str3 == null) {
                this.uniq_id = "";
            } else {
                this.uniq_id = str3;
            }
            String str4 = builder.forum_name;
            if (str4 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str4;
            }
            Integer num = builder.chatroom_mask;
            if (num == null) {
                this.chatroom_mask = DEFAULT_CHATROOM_MASK;
                return;
            } else {
                this.chatroom_mask = num;
                return;
            }
        }
        this.f1438common = builder.f1439common;
        this.data_type = builder.data_type;
        this.chatroom_new_msg = builder.chatroom_new_msg;
        this.fid = builder.fid;
        this.chatroom_id = builder.chatroom_id;
        this.uniq_id = builder.uniq_id;
        this.forum_name = builder.forum_name;
        this.chatroom_mask = builder.chatroom_mask;
    }
}

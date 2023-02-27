package tbclient.ForumMenu;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_COOKIE = "";
    @ProtoField(tag = 5)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1146common;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String cookie;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer forum_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer st_param;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer update_time;
    public static final Integer DEFAULT_UPDATE_TIME = 0;
    public static final Integer DEFAULT_FORUM_ID = 0;
    public static final Integer DEFAULT_ST_PARAM = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1147common;
        public String cookie;
        public Integer forum_id;
        public Integer st_param;
        public Integer update_time;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.update_time = dataReq.update_time;
            this.forum_id = dataReq.forum_id;
            this.st_param = dataReq.st_param;
            this.cookie = dataReq.cookie;
            this.f1147common = dataReq.f1146common;
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
            Integer num = builder.update_time;
            if (num == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = num;
            }
            Integer num2 = builder.forum_id;
            if (num2 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = num2;
            }
            Integer num3 = builder.st_param;
            if (num3 == null) {
                this.st_param = DEFAULT_ST_PARAM;
            } else {
                this.st_param = num3;
            }
            String str = builder.cookie;
            if (str == null) {
                this.cookie = "";
            } else {
                this.cookie = str;
            }
            this.f1146common = builder.f1147common;
            return;
        }
        this.update_time = builder.update_time;
        this.forum_id = builder.forum_id;
        this.st_param = builder.st_param;
        this.cookie = builder.cookie;
        this.f1146common = builder.f1147common;
    }
}

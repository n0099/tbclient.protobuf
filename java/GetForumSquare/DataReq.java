package tbclient.GetForumSquare;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CLASS_NAME = "";
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Long DEFAULT_USER_ID = 0L;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String class_name;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69426common;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long user_id;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String class_name;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69427common;
        public Integer pn;
        public Integer rn;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f69427common = dataReq.f69426common;
            this.class_name = dataReq.class_name;
            this.pn = dataReq.pn;
            this.rn = dataReq.rn;
            this.user_id = dataReq.user_id;
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
            this.f69426common = builder.f69427common;
            String str = builder.class_name;
            if (str == null) {
                this.class_name = "";
            } else {
                this.class_name = str;
            }
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            Integer num2 = builder.rn;
            if (num2 == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num2;
            }
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
                return;
            } else {
                this.user_id = l;
                return;
            }
        }
        this.f69426common = builder.f69427common;
        this.class_name = builder.class_name;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.user_id = builder.user_id;
    }
}

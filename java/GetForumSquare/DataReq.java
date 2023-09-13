package tbclient.GetForumSquare;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CLASS_NAME = "";
    public static final String DEFAULT_SECOND_CLASS_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String class_name;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1331common;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String second_class_name;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long user_id;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Long DEFAULT_USER_ID = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String class_name;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1332common;
        public Integer pn;
        public Integer rn;
        public String second_class_name;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1332common = dataReq.f1331common;
            this.class_name = dataReq.class_name;
            this.pn = dataReq.pn;
            this.rn = dataReq.rn;
            this.user_id = dataReq.user_id;
            this.second_class_name = dataReq.second_class_name;
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
            this.f1331common = builder.f1332common;
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
            } else {
                this.user_id = l;
            }
            String str2 = builder.second_class_name;
            if (str2 == null) {
                this.second_class_name = "";
                return;
            } else {
                this.second_class_name = str2;
                return;
            }
        }
        this.f1331common = builder.f1332common;
        this.class_name = builder.class_name;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.user_id = builder.user_id;
        this.second_class_name = builder.second_class_name;
    }
}

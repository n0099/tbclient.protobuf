package tbclient.GetWorksTags;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_FIRST_CLASS = "";
    public static final String DEFAULT_SECOND_CLASS = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1407common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String first_class;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String second_class;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1408common;
        public String first_class;
        public String second_class;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1408common = dataReq.f1407common;
            this.first_class = dataReq.first_class;
            this.second_class = dataReq.second_class;
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
            this.f1407common = builder.f1408common;
            String str = builder.first_class;
            if (str == null) {
                this.first_class = "";
            } else {
                this.first_class = str;
            }
            String str2 = builder.second_class;
            if (str2 == null) {
                this.second_class = "";
                return;
            } else {
                this.second_class = str2;
                return;
            }
        }
        this.f1407common = builder.f1408common;
        this.first_class = builder.first_class;
        this.second_class = builder.second_class;
    }
}

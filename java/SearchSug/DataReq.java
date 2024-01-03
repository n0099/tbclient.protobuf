package tbclient.SearchSug;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CALL_FROM = "";
    public static final String DEFAULT_ISFORUM = "";
    public static final String DEFAULT_WORD = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String call_from;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1469common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String isforum;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String word;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String call_from;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1470common;
        public String isforum;
        public String word;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1470common = dataReq.f1469common;
            this.word = dataReq.word;
            this.isforum = dataReq.isforum;
            this.call_from = dataReq.call_from;
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
            this.f1469common = builder.f1470common;
            String str = builder.word;
            if (str == null) {
                this.word = "";
            } else {
                this.word = str;
            }
            String str2 = builder.isforum;
            if (str2 == null) {
                this.isforum = "";
            } else {
                this.isforum = str2;
            }
            String str3 = builder.call_from;
            if (str3 == null) {
                this.call_from = "";
                return;
            } else {
                this.call_from = str3;
                return;
            }
        }
        this.f1469common = builder.f1470common;
        this.word = builder.word;
        this.isforum = builder.isforum;
        this.call_from = builder.call_from;
    }
}

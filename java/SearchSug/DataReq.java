package tbclient.SearchSug;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ISFORUM = "";
    public static final String DEFAULT_WORD = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69486common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String isforum;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String word;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69487common;
        public String isforum;
        public String word;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f69487common = dataReq.f69486common;
            this.word = dataReq.word;
            this.isforum = dataReq.isforum;
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
            this.f69486common = builder.f69487common;
            String str = builder.word;
            if (str == null) {
                this.word = "";
            } else {
                this.word = str;
            }
            String str2 = builder.isforum;
            if (str2 == null) {
                this.isforum = "";
                return;
            } else {
                this.isforum = str2;
                return;
            }
        }
        this.f69486common = builder.f69487common;
        this.word = builder.word;
        this.isforum = builder.isforum;
    }
}

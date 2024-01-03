package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class EsportRank extends Message {
    public static final Integer DEFAULT_RANK = 0;
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer rank;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 3)
    public final EsportUser user;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<EsportRank> {
        public Integer rank;
        public String text;
        public String title;
        public String url;
        public EsportUser user;

        public Builder() {
        }

        public Builder(EsportRank esportRank) {
            super(esportRank);
            if (esportRank == null) {
                return;
            }
            this.title = esportRank.title;
            this.rank = esportRank.rank;
            this.user = esportRank.user;
            this.text = esportRank.text;
            this.url = esportRank.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public EsportRank build(boolean z) {
            return new EsportRank(this, z);
        }
    }

    public EsportRank(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num = builder.rank;
            if (num == null) {
                this.rank = DEFAULT_RANK;
            } else {
                this.rank = num;
            }
            this.user = builder.user;
            String str2 = builder.text;
            if (str2 == null) {
                this.text = "";
            } else {
                this.text = str2;
            }
            String str3 = builder.url;
            if (str3 == null) {
                this.url = "";
                return;
            } else {
                this.url = str3;
                return;
            }
        }
        this.title = builder.title;
        this.rank = builder.rank;
        this.user = builder.user;
        this.text = builder.text;
        this.url = builder.url;
    }
}

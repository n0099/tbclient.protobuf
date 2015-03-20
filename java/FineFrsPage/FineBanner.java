package tbclient.FineFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class FineBanner extends Message {
    public static final Long DEFAULT_FTID = 0L;
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long ftid;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* synthetic */ FineBanner(Builder builder, boolean z, FineBanner fineBanner) {
        this(builder, z);
    }

    private FineBanner(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.ftid == null) {
                this.ftid = DEFAULT_FTID;
            } else {
                this.ftid = builder.ftid;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.pic_url == null) {
                this.pic_url = "";
                return;
            } else {
                this.pic_url = builder.pic_url;
                return;
            }
        }
        this.ftid = builder.ftid;
        this.title = builder.title;
        this.pic_url = builder.pic_url;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<FineBanner> {
        public Long ftid;
        public String pic_url;
        public String title;

        public Builder(FineBanner fineBanner) {
            super(fineBanner);
            if (fineBanner != null) {
                this.ftid = fineBanner.ftid;
                this.title = fineBanner.title;
                this.pic_url = fineBanner.pic_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FineBanner build(boolean z) {
            return new FineBanner(this, z, null);
        }
    }
}

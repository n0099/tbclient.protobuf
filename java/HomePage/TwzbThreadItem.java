package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class TwzbThreadItem extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_LINK_URL = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final Long DEFAULT_TID = 0L;
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String link_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TwzbThreadItem> {
        public String _abstract;
        public String link_url;
        public String pic_url;
        public Long tid;
        public String title;

        public Builder() {
        }

        public Builder(TwzbThreadItem twzbThreadItem) {
            super(twzbThreadItem);
            if (twzbThreadItem == null) {
                return;
            }
            this.tid = twzbThreadItem.tid;
            this.title = twzbThreadItem.title;
            this._abstract = twzbThreadItem._abstract;
            this.pic_url = twzbThreadItem.pic_url;
            this.link_url = twzbThreadItem.link_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwzbThreadItem build(boolean z) {
            return new TwzbThreadItem(this, z);
        }
    }

    public TwzbThreadItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder._abstract;
            if (str2 == null) {
                this._abstract = "";
            } else {
                this._abstract = str2;
            }
            String str3 = builder.pic_url;
            if (str3 == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str3;
            }
            String str4 = builder.link_url;
            if (str4 == null) {
                this.link_url = "";
                return;
            } else {
                this.link_url = str4;
                return;
            }
        }
        this.tid = builder.tid;
        this.title = builder.title;
        this._abstract = builder._abstract;
        this.pic_url = builder.pic_url;
        this.link_url = builder.link_url;
    }
}

package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class SpriteMemeInfo extends Message {
    public static final String DEFAULT_ICON = "";
    public static final Long DEFAULT_MEME_ID = 0L;
    public static final String DEFAULT_QUERY = "";
    public static final String DEFAULT_USE_SAME_GUIDE = "";
    public static final String DEFAULT_USE_SAME_TEXT = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long meme_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String query;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String use_same_guide;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String use_same_text;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<SpriteMemeInfo> {
        public String icon;
        public Long meme_id;
        public String query;
        public String use_same_guide;
        public String use_same_text;

        public Builder() {
        }

        public Builder(SpriteMemeInfo spriteMemeInfo) {
            super(spriteMemeInfo);
            if (spriteMemeInfo == null) {
                return;
            }
            this.meme_id = spriteMemeInfo.meme_id;
            this.query = spriteMemeInfo.query;
            this.icon = spriteMemeInfo.icon;
            this.use_same_guide = spriteMemeInfo.use_same_guide;
            this.use_same_text = spriteMemeInfo.use_same_text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SpriteMemeInfo build(boolean z) {
            return new SpriteMemeInfo(this, z);
        }
    }

    public SpriteMemeInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.meme_id;
            if (l == null) {
                this.meme_id = DEFAULT_MEME_ID;
            } else {
                this.meme_id = l;
            }
            String str = builder.query;
            if (str == null) {
                this.query = "";
            } else {
                this.query = str;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
            } else {
                this.icon = str2;
            }
            String str3 = builder.use_same_guide;
            if (str3 == null) {
                this.use_same_guide = "";
            } else {
                this.use_same_guide = str3;
            }
            String str4 = builder.use_same_text;
            if (str4 == null) {
                this.use_same_text = "";
                return;
            } else {
                this.use_same_text = str4;
                return;
            }
        }
        this.meme_id = builder.meme_id;
        this.query = builder.query;
        this.icon = builder.icon;
        this.use_same_guide = builder.use_same_guide;
        this.use_same_text = builder.use_same_text;
    }
}

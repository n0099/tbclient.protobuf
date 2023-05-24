package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class FeedHeadImg extends Message {
    public static final String DEFAULT_CORNER_URL = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_PENDANT_URL = "";
    public static final String DEFAULT_SCHEMA = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String corner_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.STRING)
    public final List<String> masks;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pendant_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer shape_type;
    public static final Integer DEFAULT_SHAPE_TYPE = 0;
    public static final List<String> DEFAULT_MASKS = Collections.emptyList();

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FeedHeadImg> {
        public String corner_url;
        public String img_url;
        public List<String> masks;
        public String pendant_url;
        public String schema;
        public Integer shape_type;

        public Builder() {
        }

        public Builder(FeedHeadImg feedHeadImg) {
            super(feedHeadImg);
            if (feedHeadImg == null) {
                return;
            }
            this.img_url = feedHeadImg.img_url;
            this.shape_type = feedHeadImg.shape_type;
            this.pendant_url = feedHeadImg.pendant_url;
            this.corner_url = feedHeadImg.corner_url;
            this.schema = feedHeadImg.schema;
            this.masks = Message.copyOf(feedHeadImg.masks);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedHeadImg build(boolean z) {
            return new FeedHeadImg(this, z);
        }
    }

    public FeedHeadImg(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.img_url;
            if (str == null) {
                this.img_url = "";
            } else {
                this.img_url = str;
            }
            Integer num = builder.shape_type;
            if (num == null) {
                this.shape_type = DEFAULT_SHAPE_TYPE;
            } else {
                this.shape_type = num;
            }
            String str2 = builder.pendant_url;
            if (str2 == null) {
                this.pendant_url = "";
            } else {
                this.pendant_url = str2;
            }
            String str3 = builder.corner_url;
            if (str3 == null) {
                this.corner_url = "";
            } else {
                this.corner_url = str3;
            }
            String str4 = builder.schema;
            if (str4 == null) {
                this.schema = "";
            } else {
                this.schema = str4;
            }
            List<String> list = builder.masks;
            if (list == null) {
                this.masks = DEFAULT_MASKS;
                return;
            } else {
                this.masks = Message.immutableCopyOf(list);
                return;
            }
        }
        this.img_url = builder.img_url;
        this.shape_type = builder.shape_type;
        this.pendant_url = builder.pendant_url;
        this.corner_url = builder.corner_url;
        this.schema = builder.schema;
        this.masks = Message.immutableCopyOf(builder.masks);
    }
}

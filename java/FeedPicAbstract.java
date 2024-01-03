package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class FeedPicAbstract extends Message {
    public static final String DEFAULT_PIC_SCHEME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedContentResource> _abstract;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pic_scheme;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<PicInfo> pics;
    public static final List<PicInfo> DEFAULT_PICS = Collections.emptyList();
    public static final List<FeedContentResource> DEFAULT_ABSTRACT = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FeedPicAbstract> {
        public List<FeedContentResource> _abstract;
        public String pic_scheme;
        public List<PicInfo> pics;

        public Builder() {
        }

        public Builder(FeedPicAbstract feedPicAbstract) {
            super(feedPicAbstract);
            if (feedPicAbstract == null) {
                return;
            }
            this.pics = Message.copyOf(feedPicAbstract.pics);
            this.pic_scheme = feedPicAbstract.pic_scheme;
            this._abstract = Message.copyOf(feedPicAbstract._abstract);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedPicAbstract build(boolean z) {
            return new FeedPicAbstract(this, z);
        }
    }

    public FeedPicAbstract(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<PicInfo> list = builder.pics;
            if (list == null) {
                this.pics = DEFAULT_PICS;
            } else {
                this.pics = Message.immutableCopyOf(list);
            }
            String str = builder.pic_scheme;
            if (str == null) {
                this.pic_scheme = "";
            } else {
                this.pic_scheme = str;
            }
            List<FeedContentResource> list2 = builder._abstract;
            if (list2 == null) {
                this._abstract = DEFAULT_ABSTRACT;
                return;
            } else {
                this._abstract = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.pics = Message.immutableCopyOf(builder.pics);
        this.pic_scheme = builder.pic_scheme;
        this._abstract = Message.immutableCopyOf(builder._abstract);
    }
}

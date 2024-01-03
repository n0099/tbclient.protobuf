package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class FrsTopThreadComponent extends Message {
    public static final String DEFAULT_SCHEME = "";
    @ProtoField(tag = 3)
    public final FeedAuthorSocial author_social;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<FeedKV> business_info;
    @ProtoField(tag = 2)
    public final FeedPicAbstract pic_abstract;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String scheme;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeedContentResource> title;
    public static final List<FeedContentResource> DEFAULT_TITLE = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FrsTopThreadComponent> {
        public FeedAuthorSocial author_social;
        public List<FeedKV> business_info;
        public FeedPicAbstract pic_abstract;
        public String scheme;
        public List<FeedContentResource> title;

        public Builder() {
        }

        public Builder(FrsTopThreadComponent frsTopThreadComponent) {
            super(frsTopThreadComponent);
            if (frsTopThreadComponent == null) {
                return;
            }
            this.title = Message.copyOf(frsTopThreadComponent.title);
            this.pic_abstract = frsTopThreadComponent.pic_abstract;
            this.author_social = frsTopThreadComponent.author_social;
            this.business_info = Message.copyOf(frsTopThreadComponent.business_info);
            this.scheme = frsTopThreadComponent.scheme;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsTopThreadComponent build(boolean z) {
            return new FrsTopThreadComponent(this, z);
        }
    }

    public FrsTopThreadComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FeedContentResource> list = builder.title;
            if (list == null) {
                this.title = DEFAULT_TITLE;
            } else {
                this.title = Message.immutableCopyOf(list);
            }
            this.pic_abstract = builder.pic_abstract;
            this.author_social = builder.author_social;
            List<FeedKV> list2 = builder.business_info;
            if (list2 == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
            } else {
                this.business_info = Message.immutableCopyOf(list2);
            }
            String str = builder.scheme;
            if (str == null) {
                this.scheme = "";
                return;
            } else {
                this.scheme = str;
                return;
            }
        }
        this.title = Message.immutableCopyOf(builder.title);
        this.pic_abstract = builder.pic_abstract;
        this.author_social = builder.author_social;
        this.business_info = Message.immutableCopyOf(builder.business_info);
        this.scheme = builder.scheme;
    }
}

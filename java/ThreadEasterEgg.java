package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ThreadEasterEgg extends Message {
    public static final String DEFAULT_ACTIVITY_ID = "";
    public static final String DEFAULT_POP_IMAGEURL = "";
    public static final String DEFAULT_POP_TEXT = "";
    public static final String DEFAULT_VIDEO_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String activity_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String pop_imageurl;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pop_text;
    @ProtoField(tag = 5)
    public final ShareInfo share_info;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String video_url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ThreadEasterEgg> {
        public String activity_id;
        public String pop_imageurl;
        public String pop_text;
        public ShareInfo share_info;
        public String video_url;

        public Builder() {
        }

        public Builder(ThreadEasterEgg threadEasterEgg) {
            super(threadEasterEgg);
            if (threadEasterEgg == null) {
                return;
            }
            this.activity_id = threadEasterEgg.activity_id;
            this.video_url = threadEasterEgg.video_url;
            this.pop_text = threadEasterEgg.pop_text;
            this.pop_imageurl = threadEasterEgg.pop_imageurl;
            this.share_info = threadEasterEgg.share_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadEasterEgg build(boolean z) {
            return new ThreadEasterEgg(this, z);
        }
    }

    public ThreadEasterEgg(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.activity_id;
            if (str == null) {
                this.activity_id = "";
            } else {
                this.activity_id = str;
            }
            String str2 = builder.video_url;
            if (str2 == null) {
                this.video_url = "";
            } else {
                this.video_url = str2;
            }
            String str3 = builder.pop_text;
            if (str3 == null) {
                this.pop_text = "";
            } else {
                this.pop_text = str3;
            }
            String str4 = builder.pop_imageurl;
            if (str4 == null) {
                this.pop_imageurl = "";
            } else {
                this.pop_imageurl = str4;
            }
            this.share_info = builder.share_info;
            return;
        }
        this.activity_id = builder.activity_id;
        this.video_url = builder.video_url;
        this.pop_text = builder.pop_text;
        this.pop_imageurl = builder.pop_imageurl;
        this.share_info = builder.share_info;
    }
}

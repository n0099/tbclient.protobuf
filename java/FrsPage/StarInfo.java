package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class StarInfo extends Message {
    public static final String DEFAULT_HEAD = "";
    public static final String DEFAULT_STAR_FORUM_HEADIMG = "";
    public static final String DEFAULT_TOP = "";
    @ProtoField(tag = 6)
    public final Fans fans;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<Focus> focus;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer gender;
    @ProtoField(tag = 12)
    public final Good good;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer has_frs_star;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String head;
    @ProtoField(tag = 15)
    public final Size head_size;
    @ProtoField(tag = 13)
    public final Identify identify;
    @ProtoField(tag = 5)
    public final Info info;
    @ProtoField(tag = 10)
    public final Music music;
    @ProtoField(tag = 11)
    public final Music mv;
    @ProtoField(tag = 8)
    public final PhotoInfo photo;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String star_forum_headimg;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String top;
    @ProtoField(tag = 14)
    public final Size top_size;
    @ProtoField(tag = 16)
    public final Ticket trade;
    @ProtoField(tag = 9)
    public final Video video;
    public static final Integer DEFAULT_HAS_FRS_STAR = 0;
    public static final Integer DEFAULT_GENDER = 0;
    public static final List<Focus> DEFAULT_FOCUS = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<StarInfo> {
        public Fans fans;
        public List<Focus> focus;
        public Integer gender;
        public Good good;
        public Integer has_frs_star;
        public String head;
        public Size head_size;
        public Identify identify;
        public Info info;
        public Music music;
        public Music mv;
        public PhotoInfo photo;
        public String star_forum_headimg;
        public String top;
        public Size top_size;
        public Ticket trade;
        public Video video;

        public Builder() {
        }

        public Builder(StarInfo starInfo) {
            super(starInfo);
            if (starInfo == null) {
                return;
            }
            this.has_frs_star = starInfo.has_frs_star;
            this.top = starInfo.top;
            this.head = starInfo.head;
            this.gender = starInfo.gender;
            this.info = starInfo.info;
            this.fans = starInfo.fans;
            this.focus = Message.copyOf(starInfo.focus);
            this.photo = starInfo.photo;
            this.video = starInfo.video;
            this.music = starInfo.music;
            this.mv = starInfo.mv;
            this.good = starInfo.good;
            this.identify = starInfo.identify;
            this.top_size = starInfo.top_size;
            this.head_size = starInfo.head_size;
            this.trade = starInfo.trade;
            this.star_forum_headimg = starInfo.star_forum_headimg;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarInfo build(boolean z) {
            return new StarInfo(this, z);
        }
    }

    public StarInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.has_frs_star;
            if (num == null) {
                this.has_frs_star = DEFAULT_HAS_FRS_STAR;
            } else {
                this.has_frs_star = num;
            }
            String str = builder.top;
            if (str == null) {
                this.top = "";
            } else {
                this.top = str;
            }
            String str2 = builder.head;
            if (str2 == null) {
                this.head = "";
            } else {
                this.head = str2;
            }
            Integer num2 = builder.gender;
            if (num2 == null) {
                this.gender = DEFAULT_GENDER;
            } else {
                this.gender = num2;
            }
            this.info = builder.info;
            this.fans = builder.fans;
            List<Focus> list = builder.focus;
            if (list == null) {
                this.focus = DEFAULT_FOCUS;
            } else {
                this.focus = Message.immutableCopyOf(list);
            }
            this.photo = builder.photo;
            this.video = builder.video;
            this.music = builder.music;
            this.mv = builder.mv;
            this.good = builder.good;
            this.identify = builder.identify;
            this.top_size = builder.top_size;
            this.head_size = builder.head_size;
            this.trade = builder.trade;
            String str3 = builder.star_forum_headimg;
            if (str3 == null) {
                this.star_forum_headimg = "";
                return;
            } else {
                this.star_forum_headimg = str3;
                return;
            }
        }
        this.has_frs_star = builder.has_frs_star;
        this.top = builder.top;
        this.head = builder.head;
        this.gender = builder.gender;
        this.info = builder.info;
        this.fans = builder.fans;
        this.focus = Message.immutableCopyOf(builder.focus);
        this.photo = builder.photo;
        this.video = builder.video;
        this.music = builder.music;
        this.mv = builder.mv;
        this.good = builder.good;
        this.identify = builder.identify;
        this.top_size = builder.top_size;
        this.head_size = builder.head_size;
        this.trade = builder.trade;
        this.star_forum_headimg = builder.star_forum_headimg;
    }
}

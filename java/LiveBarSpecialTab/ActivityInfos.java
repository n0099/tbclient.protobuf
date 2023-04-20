package tbclient.LiveBarSpecialTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ActivityInfos extends Message {
    public static final String DEFAULT_PIC = "";
    public static final Integer DEFAULT_POSITION = 0;
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_WORD = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pic;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer position;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String word;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ActivityInfos> {
        public String pic;
        public Integer position;
        public String title;
        public String url;
        public String word;

        public Builder() {
        }

        public Builder(ActivityInfos activityInfos) {
            super(activityInfos);
            if (activityInfos == null) {
                return;
            }
            this.url = activityInfos.url;
            this.pic = activityInfos.pic;
            this.word = activityInfos.word;
            this.title = activityInfos.title;
            this.position = activityInfos.position;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActivityInfos build(boolean z) {
            return new ActivityInfos(this, z);
        }
    }

    public ActivityInfos(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.pic;
            if (str2 == null) {
                this.pic = "";
            } else {
                this.pic = str2;
            }
            String str3 = builder.word;
            if (str3 == null) {
                this.word = "";
            } else {
                this.word = str3;
            }
            String str4 = builder.title;
            if (str4 == null) {
                this.title = "";
            } else {
                this.title = str4;
            }
            Integer num = builder.position;
            if (num == null) {
                this.position = DEFAULT_POSITION;
                return;
            } else {
                this.position = num;
                return;
            }
        }
        this.url = builder.url;
        this.pic = builder.pic;
        this.word = builder.word;
        this.title = builder.title;
        this.position = builder.position;
    }
}

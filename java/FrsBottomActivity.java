package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class FrsBottomActivity extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_IMAGE = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 6)
    public final FrsBottomActivityTime activity_time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String image;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FrsBottomActivity> {
        public String _abstract;
        public FrsBottomActivityTime activity_time;
        public String icon;
        public String image;
        public String jump_url;
        public String title;

        public Builder() {
        }

        public Builder(FrsBottomActivity frsBottomActivity) {
            super(frsBottomActivity);
            if (frsBottomActivity == null) {
                return;
            }
            this.title = frsBottomActivity.title;
            this._abstract = frsBottomActivity._abstract;
            this.image = frsBottomActivity.image;
            this.icon = frsBottomActivity.icon;
            this.jump_url = frsBottomActivity.jump_url;
            this.activity_time = frsBottomActivity.activity_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsBottomActivity build(boolean z) {
            return new FrsBottomActivity(this, z);
        }
    }

    public FrsBottomActivity(Builder builder, boolean z) {
        super(builder);
        if (z) {
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
            String str3 = builder.image;
            if (str3 == null) {
                this.image = "";
            } else {
                this.image = str3;
            }
            String str4 = builder.icon;
            if (str4 == null) {
                this.icon = "";
            } else {
                this.icon = str4;
            }
            String str5 = builder.jump_url;
            if (str5 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str5;
            }
            this.activity_time = builder.activity_time;
            return;
        }
        this.title = builder.title;
        this._abstract = builder._abstract;
        this.image = builder.image;
        this.icon = builder.icon;
        this.jump_url = builder.jump_url;
        this.activity_time = builder.activity_time;
    }
}

package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class ForumArIno extends Message {
    public static final String DEFAULT_ANIMATION_URL = "";
    public static final String DEFAULT_SUSPENSION_URL = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer _switch;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String animation_url;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer ar_id;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer ar_type;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String suspension_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    public static final Integer DEFAULT_SWITCH = 0;
    public static final Integer DEFAULT_AR_ID = 0;
    public static final Integer DEFAULT_AR_TYPE = 0;

    private ForumArIno(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder._switch == null) {
                this._switch = DEFAULT_SWITCH;
            } else {
                this._switch = builder._switch;
            }
            if (builder.ar_id == null) {
                this.ar_id = DEFAULT_AR_ID;
            } else {
                this.ar_id = builder.ar_id;
            }
            if (builder.ar_type == null) {
                this.ar_type = DEFAULT_AR_TYPE;
            } else {
                this.ar_type = builder.ar_type;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.animation_url == null) {
                this.animation_url = "";
            } else {
                this.animation_url = builder.animation_url;
            }
            if (builder.suspension_url == null) {
                this.suspension_url = "";
                return;
            } else {
                this.suspension_url = builder.suspension_url;
                return;
            }
        }
        this._switch = builder._switch;
        this.ar_id = builder.ar_id;
        this.ar_type = builder.ar_type;
        this.title = builder.title;
        this.animation_url = builder.animation_url;
        this.suspension_url = builder.suspension_url;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<ForumArIno> {
        public Integer _switch;
        public String animation_url;
        public Integer ar_id;
        public Integer ar_type;
        public String suspension_url;
        public String title;

        public Builder() {
        }

        public Builder(ForumArIno forumArIno) {
            super(forumArIno);
            if (forumArIno != null) {
                this._switch = forumArIno._switch;
                this.ar_id = forumArIno.ar_id;
                this.ar_type = forumArIno.ar_type;
                this.title = forumArIno.title;
                this.animation_url = forumArIno.animation_url;
                this.suspension_url = forumArIno.suspension_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumArIno build(boolean z) {
            return new ForumArIno(this, z);
        }
    }
}

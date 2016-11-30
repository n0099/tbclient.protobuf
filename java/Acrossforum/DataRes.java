package tbclient.Acrossforum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final List<AcrossForum> DEFAULT_ACROSS_FORUM = Collections.emptyList();
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_SHARE_ABSTRACT = "";
    public static final String DEFAULT_SHARE_PIC = "";
    public static final String DEFAULT_SHARE_TITLE = "";
    public static final String DEFAULT_USER_PORTRAIT = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<AcrossForum> across_forum;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String share_abstract;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String share_pic;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String share_title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_portrait;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.across_forum == null) {
                this.across_forum = DEFAULT_ACROSS_FORUM;
            } else {
                this.across_forum = immutableCopyOf(builder.across_forum);
            }
            if (builder.jump_url == null) {
                this.jump_url = "";
            } else {
                this.jump_url = builder.jump_url;
            }
            if (builder.user_portrait == null) {
                this.user_portrait = "";
            } else {
                this.user_portrait = builder.user_portrait;
            }
            if (builder.share_title == null) {
                this.share_title = "";
            } else {
                this.share_title = builder.share_title;
            }
            if (builder.share_abstract == null) {
                this.share_abstract = "";
            } else {
                this.share_abstract = builder.share_abstract;
            }
            if (builder.share_pic == null) {
                this.share_pic = "";
                return;
            } else {
                this.share_pic = builder.share_pic;
                return;
            }
        }
        this.across_forum = immutableCopyOf(builder.across_forum);
        this.jump_url = builder.jump_url;
        this.user_portrait = builder.user_portrait;
        this.share_title = builder.share_title;
        this.share_abstract = builder.share_abstract;
        this.share_pic = builder.share_pic;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<AcrossForum> across_forum;
        public String jump_url;
        public String share_abstract;
        public String share_pic;
        public String share_title;
        public String user_portrait;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.across_forum = DataRes.copyOf(dataRes.across_forum);
                this.jump_url = dataRes.jump_url;
                this.user_portrait = dataRes.user_portrait;
                this.share_title = dataRes.share_title;
                this.share_abstract = dataRes.share_abstract;
                this.share_pic = dataRes.share_pic;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}

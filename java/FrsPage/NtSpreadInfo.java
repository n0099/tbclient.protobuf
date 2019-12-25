package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes6.dex */
public final class NtSpreadInfo extends Message {
    public static final String DEFAULT_LINK_URL = "";
    public static final List<String> DEFAULT_PICS = Collections.emptyList();
    public static final Integer DEFAULT_POSITION = 0;
    public static final String DEFAULT_PUBLISH_DATE = "";
    public static final String DEFAULT_TIPS = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TYPE = "";
    public static final String DEFAULT_USER_AVATAR = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String link_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.STRING)
    public final List<String> pics;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer position;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String publish_date;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tips;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_avatar;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String user_name;

    private NtSpreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.user_avatar == null) {
                this.user_avatar = "";
            } else {
                this.user_avatar = builder.user_avatar;
            }
            if (builder.tips == null) {
                this.tips = "";
            } else {
                this.tips = builder.tips;
            }
            if (builder.type == null) {
                this.type = "";
            } else {
                this.type = builder.type;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.pics == null) {
                this.pics = DEFAULT_PICS;
            } else {
                this.pics = immutableCopyOf(builder.pics);
            }
            if (builder.link_url == null) {
                this.link_url = "";
            } else {
                this.link_url = builder.link_url;
            }
            if (builder.position == null) {
                this.position = DEFAULT_POSITION;
            } else {
                this.position = builder.position;
            }
            if (builder.publish_date == null) {
                this.publish_date = "";
                return;
            } else {
                this.publish_date = builder.publish_date;
                return;
            }
        }
        this.user_name = builder.user_name;
        this.user_avatar = builder.user_avatar;
        this.tips = builder.tips;
        this.type = builder.type;
        this.title = builder.title;
        this.pics = immutableCopyOf(builder.pics);
        this.link_url = builder.link_url;
        this.position = builder.position;
        this.publish_date = builder.publish_date;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<NtSpreadInfo> {
        public String link_url;
        public List<String> pics;
        public Integer position;
        public String publish_date;
        public String tips;
        public String title;
        public String type;
        public String user_avatar;
        public String user_name;

        public Builder() {
        }

        public Builder(NtSpreadInfo ntSpreadInfo) {
            super(ntSpreadInfo);
            if (ntSpreadInfo != null) {
                this.user_name = ntSpreadInfo.user_name;
                this.user_avatar = ntSpreadInfo.user_avatar;
                this.tips = ntSpreadInfo.tips;
                this.type = ntSpreadInfo.type;
                this.title = ntSpreadInfo.title;
                this.pics = NtSpreadInfo.copyOf(ntSpreadInfo.pics);
                this.link_url = ntSpreadInfo.link_url;
                this.position = ntSpreadInfo.position;
                this.publish_date = ntSpreadInfo.publish_date;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NtSpreadInfo build(boolean z) {
            return new NtSpreadInfo(this, z);
        }
    }
}

package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GodDetailInfo extends Message {
    public static final String DEFAULT_DETAIL_INTRO = "";
    public static final String DEFAULT_INTRO = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String detail_intro;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long god_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id;
    public static final Long DEFAULT_GOD_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;

    private GodDetailInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.god_id == null) {
                this.god_id = DEFAULT_GOD_ID;
            } else {
                this.god_id = builder.god_id;
            }
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.intro == null) {
                this.intro = "";
            } else {
                this.intro = builder.intro;
            }
            if (builder.detail_intro == null) {
                this.detail_intro = "";
                return;
            } else {
                this.detail_intro = builder.detail_intro;
                return;
            }
        }
        this.god_id = builder.god_id;
        this.user_id = builder.user_id;
        this.intro = builder.intro;
        this.detail_intro = builder.detail_intro;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GodDetailInfo> {
        public String detail_intro;
        public Long god_id;
        public String intro;
        public Long user_id;

        public Builder() {
        }

        public Builder(GodDetailInfo godDetailInfo) {
            super(godDetailInfo);
            if (godDetailInfo != null) {
                this.god_id = godDetailInfo.god_id;
                this.user_id = godDetailInfo.user_id;
                this.intro = godDetailInfo.intro;
                this.detail_intro = godDetailInfo.detail_intro;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodDetailInfo build(boolean z) {
            return new GodDetailInfo(this, z);
        }
    }
}
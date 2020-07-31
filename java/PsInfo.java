package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class PsInfo extends Message {
    public static final String DEFAULT_GAME_INTRO = "";
    public static final String DEFAULT_GAME_PIC_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long game_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String game_intro;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String game_pic_url;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long game_type;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long score;
    public static final Long DEFAULT_GAME_ID = 0L;
    public static final Long DEFAULT_SCORE = 0L;
    public static final Long DEFAULT_GAME_TYPE = 0L;

    private PsInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.game_id == null) {
                this.game_id = DEFAULT_GAME_ID;
            } else {
                this.game_id = builder.game_id;
            }
            if (builder.score == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = builder.score;
            }
            if (builder.game_type == null) {
                this.game_type = DEFAULT_GAME_TYPE;
            } else {
                this.game_type = builder.game_type;
            }
            if (builder.game_pic_url == null) {
                this.game_pic_url = "";
            } else {
                this.game_pic_url = builder.game_pic_url;
            }
            if (builder.game_intro == null) {
                this.game_intro = "";
                return;
            } else {
                this.game_intro = builder.game_intro;
                return;
            }
        }
        this.game_id = builder.game_id;
        this.score = builder.score;
        this.game_type = builder.game_type;
        this.game_pic_url = builder.game_pic_url;
        this.game_intro = builder.game_intro;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<PsInfo> {
        public Long game_id;
        public String game_intro;
        public String game_pic_url;
        public Long game_type;
        public Long score;

        public Builder() {
        }

        public Builder(PsInfo psInfo) {
            super(psInfo);
            if (psInfo != null) {
                this.game_id = psInfo.game_id;
                this.score = psInfo.score;
                this.game_type = psInfo.game_type;
                this.game_pic_url = psInfo.game_pic_url;
                this.game_intro = psInfo.game_intro;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PsInfo build(boolean z) {
            return new PsInfo(this, z);
        }
    }
}

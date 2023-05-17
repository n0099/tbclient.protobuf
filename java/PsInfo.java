package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
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

    /* loaded from: classes2.dex */
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
            if (psInfo == null) {
                return;
            }
            this.game_id = psInfo.game_id;
            this.score = psInfo.score;
            this.game_type = psInfo.game_type;
            this.game_pic_url = psInfo.game_pic_url;
            this.game_intro = psInfo.game_intro;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PsInfo build(boolean z) {
            return new PsInfo(this, z);
        }
    }

    public PsInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.game_id;
            if (l == null) {
                this.game_id = DEFAULT_GAME_ID;
            } else {
                this.game_id = l;
            }
            Long l2 = builder.score;
            if (l2 == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = l2;
            }
            Long l3 = builder.game_type;
            if (l3 == null) {
                this.game_type = DEFAULT_GAME_TYPE;
            } else {
                this.game_type = l3;
            }
            String str = builder.game_pic_url;
            if (str == null) {
                this.game_pic_url = "";
            } else {
                this.game_pic_url = str;
            }
            String str2 = builder.game_intro;
            if (str2 == null) {
                this.game_intro = "";
                return;
            } else {
                this.game_intro = str2;
                return;
            }
        }
        this.game_id = builder.game_id;
        this.score = builder.score;
        this.game_type = builder.game_type;
        this.game_pic_url = builder.game_pic_url;
        this.game_intro = builder.game_intro;
    }
}

package tbclient.TalkBall;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class Competition extends Message {
    public static final String DEFAULT_BTN_TITLE = "";
    public static final List<Country> DEFAULT_COUNTRY = Collections.emptyList();
    public static final Long DEFAULT_TIME = 0L;
    public static final String DEFAULT_TYPE = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String btn_title;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Country> country;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long time;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String type;

    private Competition(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.country == null) {
                this.country = DEFAULT_COUNTRY;
            } else {
                this.country = immutableCopyOf(builder.country);
            }
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = builder.time;
            }
            if (builder.type == null) {
                this.type = "";
            } else {
                this.type = builder.type;
            }
            if (builder.btn_title == null) {
                this.btn_title = "";
                return;
            } else {
                this.btn_title = builder.btn_title;
                return;
            }
        }
        this.country = immutableCopyOf(builder.country);
        this.time = builder.time;
        this.type = builder.type;
        this.btn_title = builder.btn_title;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Competition> {
        public String btn_title;
        public List<Country> country;
        public Long time;
        public String type;

        public Builder() {
        }

        public Builder(Competition competition) {
            super(competition);
            if (competition != null) {
                this.country = Competition.copyOf(competition.country);
                this.time = competition.time;
                this.type = competition.type;
                this.btn_title = competition.btn_title;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Competition build(boolean z) {
            return new Competition(this, z);
        }
    }
}

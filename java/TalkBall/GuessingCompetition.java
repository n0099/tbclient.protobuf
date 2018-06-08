package tbclient.TalkBall;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class GuessingCompetition extends Message {
    public static final String DEFAULT_AHEAD_URL = "";
    public static final List<Competition> DEFAULT_COMPETITION = Collections.emptyList();
    public static final List<String> DEFAULT_WINNING_MESSAGE = Collections.emptyList();
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ahead_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Competition> competition;
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
    public final List<String> winning_message;

    private GuessingCompetition(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.competition == null) {
                this.competition = DEFAULT_COMPETITION;
            } else {
                this.competition = immutableCopyOf(builder.competition);
            }
            if (builder.ahead_url == null) {
                this.ahead_url = "";
            } else {
                this.ahead_url = builder.ahead_url;
            }
            if (builder.winning_message == null) {
                this.winning_message = DEFAULT_WINNING_MESSAGE;
                return;
            } else {
                this.winning_message = immutableCopyOf(builder.winning_message);
                return;
            }
        }
        this.competition = immutableCopyOf(builder.competition);
        this.ahead_url = builder.ahead_url;
        this.winning_message = immutableCopyOf(builder.winning_message);
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GuessingCompetition> {
        public String ahead_url;
        public List<Competition> competition;
        public List<String> winning_message;

        public Builder() {
        }

        public Builder(GuessingCompetition guessingCompetition) {
            super(guessingCompetition);
            if (guessingCompetition != null) {
                this.competition = GuessingCompetition.copyOf(guessingCompetition.competition);
                this.ahead_url = guessingCompetition.ahead_url;
                this.winning_message = GuessingCompetition.copyOf(guessingCompetition.winning_message);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GuessingCompetition build(boolean z) {
            return new GuessingCompetition(this, z);
        }
    }
}

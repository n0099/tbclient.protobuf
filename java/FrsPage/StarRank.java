package tbclient.FrsPage;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class StarRank extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<StarContriRecord> DEFAULT_CONTRI_RECORD_LIST;
    public static final String DEFAULT_RANK_NAME = "";
    public static final Integer DEFAULT_RANK_RANKING;
    public static final String DEFAULT_URL = "";
    public static final Integer DEFAULT_USER_CONTRI_SCORE;
    public static final String DEFAULT_USER_CURRENT_SCORE_NOTICE = "";
    public static final List<StarTaskInfo> DEFAULT_USER_TASK_INFO;
    public static final String DEFAULT_USER_TASK_NOTICE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<StarContriRecord> contri_record_list;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String rank_name;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer rank_ranking;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer user_contri_score;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String user_current_score_notice;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<StarTaskInfo> user_task_info;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String user_task_notice;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<StarRank> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<StarContriRecord> contri_record_list;
        public String rank_name;
        public Integer rank_ranking;
        public String url;
        public Integer user_contri_score;
        public String user_current_score_notice;
        public List<StarTaskInfo> user_task_info;
        public String user_task_notice;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(StarRank starRank) {
            super(starRank);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {starRank};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (starRank == null) {
                return;
            }
            this.rank_name = starRank.rank_name;
            this.rank_ranking = starRank.rank_ranking;
            this.contri_record_list = Message.copyOf(starRank.contri_record_list);
            this.user_contri_score = starRank.user_contri_score;
            this.user_task_notice = starRank.user_task_notice;
            this.user_task_info = Message.copyOf(starRank.user_task_info);
            this.user_current_score_notice = starRank.user_current_score_notice;
            this.url = starRank.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarRank build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new StarRank(this, z, null) : (StarRank) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1508677606, "Ltbclient/FrsPage/StarRank;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1508677606, "Ltbclient/FrsPage/StarRank;");
                return;
            }
        }
        DEFAULT_RANK_RANKING = 0;
        DEFAULT_CONTRI_RECORD_LIST = Collections.emptyList();
        DEFAULT_USER_CONTRI_SCORE = 0;
        DEFAULT_USER_TASK_INFO = Collections.emptyList();
    }

    public /* synthetic */ StarRank(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarRank(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.rank_name;
            if (str == null) {
                this.rank_name = "";
            } else {
                this.rank_name = str;
            }
            Integer num = builder.rank_ranking;
            if (num == null) {
                this.rank_ranking = DEFAULT_RANK_RANKING;
            } else {
                this.rank_ranking = num;
            }
            List<StarContriRecord> list = builder.contri_record_list;
            if (list == null) {
                this.contri_record_list = DEFAULT_CONTRI_RECORD_LIST;
            } else {
                this.contri_record_list = Message.immutableCopyOf(list);
            }
            Integer num2 = builder.user_contri_score;
            if (num2 == null) {
                this.user_contri_score = DEFAULT_USER_CONTRI_SCORE;
            } else {
                this.user_contri_score = num2;
            }
            String str2 = builder.user_task_notice;
            if (str2 == null) {
                this.user_task_notice = "";
            } else {
                this.user_task_notice = str2;
            }
            List<StarTaskInfo> list2 = builder.user_task_info;
            if (list2 == null) {
                this.user_task_info = DEFAULT_USER_TASK_INFO;
            } else {
                this.user_task_info = Message.immutableCopyOf(list2);
            }
            String str3 = builder.user_current_score_notice;
            if (str3 == null) {
                this.user_current_score_notice = "";
            } else {
                this.user_current_score_notice = str3;
            }
            String str4 = builder.url;
            if (str4 == null) {
                this.url = "";
                return;
            } else {
                this.url = str4;
                return;
            }
        }
        this.rank_name = builder.rank_name;
        this.rank_ranking = builder.rank_ranking;
        this.contri_record_list = Message.immutableCopyOf(builder.contri_record_list);
        this.user_contri_score = builder.user_contri_score;
        this.user_task_notice = builder.user_task_notice;
        this.user_task_info = Message.immutableCopyOf(builder.user_task_info);
        this.user_current_score_notice = builder.user_current_score_notice;
        this.url = builder.url;
    }
}

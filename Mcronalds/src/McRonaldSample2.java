// Name: Naman Rusia
// Date: Mach 5th 2023 

import java.util.*;

public class McRonaldSample2
{
   public static final int TIME = 1080;  //18 hrs * 60 min
   
   public static void main(String[] args)
   {
   
   }
   
   //returns the content of the queue in format 10:[1, 2, 3, ..]
   //if the queue is restored if is motified
   public static String display(Queue<Integer> q, int min)   //if you are storing arrival times
   //public static void display(Queue<Customer> q, int min) //if you have a Customer class
   {
	return null;

   }
   
   //returns the size of the queue
   public static int getSize(Queue<Integer> q)   //if you are storing arrival times
   //public static void display(Queue<Customer> q, int min) //if you have a Customer class
   {
	return 0;
   
   }
}

// class Customer      // if you want a Customer class
// {
//
// }


/**********************  Sample output
  

0:[]
  ServiceArea#1 -1:-1

1:[]
  ServiceArea#1 -1:-1

2:[]
  ServiceArea#1 -1:-1

new customer min#3
3:[]
  ServiceArea#1 3:7

4:[]
  ServiceArea#1 3:6

5:[]
  ServiceArea#1 3:5

6:[]
  ServiceArea#1 3:4

7:[]
  ServiceArea#1 3:3

8:[]
  ServiceArea#1 3:2

9:[]
  ServiceArea#1 3:1

new customer min#10
Customer#3 leaves and his total wait time is 7
10:[]
  ServiceArea#1 10:5

11:[]
  ServiceArea#1 10:4

12:[]
  ServiceArea#1 10:3

13:[]
  ServiceArea#1 10:2

new customer min#14
14:[14]
  ServiceArea#1 10:1

Customer#10 leaves and his total wait time is 5
15:[]
  ServiceArea#1 14:2

16:[]
  ServiceArea#1 14:1

Customer#14 leaves and his total wait time is 3
17:[]
  ServiceArea#1 -1:-1

new customer min#18
18:[]
  ServiceArea#1 18:6

19:[]
  ServiceArea#1 18:5

new customer min#20
20:[20]
  ServiceArea#1 18:4

21:[20]
  ServiceArea#1 18:3

22:[20]
  ServiceArea#1 18:2

23:[20]
  ServiceArea#1 18:1

Customer#18 leaves and his total wait time is 6
24:[]
  ServiceArea#1 20:3

25:[]
  ServiceArea#1 20:2

new customer min#26
26:[26]
  ServiceArea#1 20:1

Customer#20 leaves and his total wait time is 7
27:[]
  ServiceArea#1 26:7

28:[]
  ServiceArea#1 26:6

29:[]
  ServiceArea#1 26:5

new customer min#30
30:[30]
  ServiceArea#1 26:4

31:[30]
  ServiceArea#1 26:3

32:[30]
  ServiceArea#1 26:2

33:[30]
  ServiceArea#1 26:1

Customer#26 leaves and his total wait time is 8
34:[]
  ServiceArea#1 30:2

35:[]
  ServiceArea#1 30:1

Customer#30 leaves and his total wait time is 6
36:[]
  ServiceArea#1 -1:-1

37:[]
  ServiceArea#1 -1:-1

38:[]
  ServiceArea#1 -1:-1

39:[]
  ServiceArea#1 -1:-1

40:[]
  ServiceArea#1 -1:-1

41:[]
  ServiceArea#1 -1:-1

42:[]
  ServiceArea#1 -1:-1

new customer min#43
43:[]
  ServiceArea#1 43:3

44:[]
  ServiceArea#1 43:2

45:[]
  ServiceArea#1 43:1

Customer#43 leaves and his total wait time is 3
46:[]
  ServiceArea#1 -1:-1

new customer min#47
47:[]
  ServiceArea#1 47:7

48:[]
  ServiceArea#1 47:6

49:[]
  ServiceArea#1 47:5

new customer min#50
50:[50]
  ServiceArea#1 47:4

51:[50]
  ServiceArea#1 47:3

52:[50]
  ServiceArea#1 47:2

53:[50]
  ServiceArea#1 47:1

new customer min#54
Customer#47 leaves and his total wait time is 7
54:[54]
  ServiceArea#1 50:2

55:[54]
  ServiceArea#1 50:1

Customer#50 leaves and his total wait time is 6
56:[]
  ServiceArea#1 54:2

57:[]
  ServiceArea#1 54:1

Customer#54 leaves and his total wait time is 4
58:[]
  ServiceArea#1 -1:-1

59:[]
  ServiceArea#1 -1:-1

60:[]
  ServiceArea#1 -1:-1

61:[]
  ServiceArea#1 -1:-1

new customer min#62
62:[]
  ServiceArea#1 62:2

63:[]
  ServiceArea#1 62:1

Customer#62 leaves and his total wait time is 2
64:[]
  ServiceArea#1 -1:-1

65:[]
  ServiceArea#1 -1:-1

66:[]
  ServiceArea#1 -1:-1

67:[]
  ServiceArea#1 -1:-1

68:[]
  ServiceArea#1 -1:-1

69:[]
  ServiceArea#1 -1:-1

70:[]
  ServiceArea#1 -1:-1

71:[]
  ServiceArea#1 -1:-1

72:[]
  ServiceArea#1 -1:-1

73:[]
  ServiceArea#1 -1:-1

74:[]
  ServiceArea#1 -1:-1

75:[]
  ServiceArea#1 -1:-1

76:[]
  ServiceArea#1 -1:-1

77:[]
  ServiceArea#1 -1:-1

78:[]
  ServiceArea#1 -1:-1

79:[]
  ServiceArea#1 -1:-1

80:[]
  ServiceArea#1 -1:-1

new customer min#81
81:[]
  ServiceArea#1 81:7

82:[]
  ServiceArea#1 81:6

83:[]
  ServiceArea#1 81:5

84:[]
  ServiceArea#1 81:4

85:[]
  ServiceArea#1 81:3

86:[]
  ServiceArea#1 81:2

87:[]
  ServiceArea#1 81:1

Customer#81 leaves and his total wait time is 7
88:[]
  ServiceArea#1 -1:-1

new customer min#89
89:[]
  ServiceArea#1 89:3

90:[]
  ServiceArea#1 89:2

91:[]
  ServiceArea#1 89:1

Customer#89 leaves and his total wait time is 3
92:[]
  ServiceArea#1 -1:-1

93:[]
  ServiceArea#1 -1:-1

94:[]
  ServiceArea#1 -1:-1

new customer min#95
95:[]
  ServiceArea#1 95:7

96:[]
  ServiceArea#1 95:6

new customer min#97
97:[97]
  ServiceArea#1 95:5

98:[97]
  ServiceArea#1 95:4

99:[97]
  ServiceArea#1 95:3

100:[97]
  ServiceArea#1 95:2

101:[97]
  ServiceArea#1 95:1

Customer#95 leaves and his total wait time is 7
102:[]
  ServiceArea#1 97:7

103:[]
  ServiceArea#1 97:6

104:[]
  ServiceArea#1 97:5

105:[]
  ServiceArea#1 97:4

106:[]
  ServiceArea#1 97:3

107:[]
  ServiceArea#1 97:2

108:[]
  ServiceArea#1 97:1

new customer min#109
Customer#97 leaves and his total wait time is 12
109:[]
  ServiceArea#1 109:2

110:[]
  ServiceArea#1 109:1

new customer min#111
Customer#109 leaves and his total wait time is 2
111:[]
  ServiceArea#1 111:6

112:[]
  ServiceArea#1 111:5

113:[]
  ServiceArea#1 111:4

114:[]
  ServiceArea#1 111:3

115:[]
  ServiceArea#1 111:2

116:[]
  ServiceArea#1 111:1

Customer#111 leaves and his total wait time is 6
117:[]
  ServiceArea#1 -1:-1

new customer min#118
118:[]
  ServiceArea#1 118:2

119:[]
  ServiceArea#1 118:1

Customer#118 leaves and his total wait time is 2
120:[]
  ServiceArea#1 -1:-1

new customer min#121
121:[]
  ServiceArea#1 121:7

new customer min#122
122:[122]
  ServiceArea#1 121:6

123:[122]
  ServiceArea#1 121:5

new customer min#124
124:[122, 124]
  ServiceArea#1 121:4

125:[122, 124]
  ServiceArea#1 121:3

126:[122, 124]
  ServiceArea#1 121:2

new customer min#127
127:[122, 124, 127]
  ServiceArea#1 121:1

Customer#121 leaves and his total wait time is 7
128:[124, 127]
  ServiceArea#1 122:7

129:[124, 127]
  ServiceArea#1 122:6

new customer min#130
130:[124, 127, 130]
  ServiceArea#1 122:5

131:[124, 127, 130]
  ServiceArea#1 122:4

132:[124, 127, 130]
  ServiceArea#1 122:3

133:[124, 127, 130]
  ServiceArea#1 122:2

134:[124, 127, 130]
  ServiceArea#1 122:1

new customer min#135
Customer#122 leaves and his total wait time is 13
135:[127, 130, 135]
  ServiceArea#1 124:2

136:[127, 130, 135]
  ServiceArea#1 124:1

Customer#124 leaves and his total wait time is 13
137:[130, 135]
  ServiceArea#1 127:2

138:[130, 135]
  ServiceArea#1 127:1

Customer#127 leaves and his total wait time is 12
139:[135]
  ServiceArea#1 130:3

140:[135]
  ServiceArea#1 130:2

new customer min#141
141:[135, 141]
  ServiceArea#1 130:1

new customer min#142
Customer#130 leaves and his total wait time is 12
142:[141, 142]
  ServiceArea#1 135:2

143:[141, 142]
  ServiceArea#1 135:1

Customer#135 leaves and his total wait time is 9
144:[142]
  ServiceArea#1 141:4

new customer min#145
145:[142, 145]
  ServiceArea#1 141:3

new customer min#146
146:[142, 145, 146]
  ServiceArea#1 141:2

147:[142, 145, 146]
  ServiceArea#1 141:1

Customer#141 leaves and his total wait time is 7
148:[145, 146]
  ServiceArea#1 142:3

149:[145, 146]
  ServiceArea#1 142:2

150:[145, 146]
  ServiceArea#1 142:1

Customer#142 leaves and his total wait time is 9
151:[146]
  ServiceArea#1 145:5

new customer min#152
152:[146, 152]
  ServiceArea#1 145:4

153:[146, 152]
  ServiceArea#1 145:3

154:[146, 152]
  ServiceArea#1 145:2

new customer min#155
155:[146, 152, 155]
  ServiceArea#1 145:1

Customer#145 leaves and his total wait time is 11
156:[152, 155]
  ServiceArea#1 146:6

157:[152, 155]
  ServiceArea#1 146:5

158:[152, 155]
  ServiceArea#1 146:4

new customer min#159
159:[152, 155, 159]
  ServiceArea#1 146:3

160:[152, 155, 159]
  ServiceArea#1 146:2

161:[152, 155, 159]
  ServiceArea#1 146:1

Customer#146 leaves and his total wait time is 16
162:[155, 159]
  ServiceArea#1 152:5

163:[155, 159]
  ServiceArea#1 152:4

new customer min#164
164:[155, 159, 164]
  ServiceArea#1 152:3

165:[155, 159, 164]
  ServiceArea#1 152:2

166:[155, 159, 164]
  ServiceArea#1 152:1

new customer min#167
Customer#152 leaves and his total wait time is 15
167:[159, 164, 167]
  ServiceArea#1 155:3

168:[159, 164, 167]
  ServiceArea#1 155:2

169:[159, 164, 167]
  ServiceArea#1 155:1

Customer#155 leaves and his total wait time is 15
170:[164, 167]
  ServiceArea#1 159:6

171:[164, 167]
  ServiceArea#1 159:5

172:[164, 167]
  ServiceArea#1 159:4

173:[164, 167]
  ServiceArea#1 159:3

174:[164, 167]
  ServiceArea#1 159:2

175:[164, 167]
  ServiceArea#1 159:1

Customer#159 leaves and his total wait time is 17
176:[167]
  ServiceArea#1 164:6

new customer min#177
177:[167, 177]
  ServiceArea#1 164:5

178:[167, 177]
  ServiceArea#1 164:4

179:[167, 177]
  ServiceArea#1 164:3

new customer min#180
180:[167, 177, 180]
  ServiceArea#1 164:2

new customer min#181
181:[167, 177, 180, 181]
  ServiceArea#1 164:1

Customer#164 leaves and his total wait time is 18
182:[177, 180, 181]
  ServiceArea#1 167:2

new customer min#183
183:[177, 180, 181, 183]
  ServiceArea#1 167:1

Customer#167 leaves and his total wait time is 17
184:[180, 181, 183]
  ServiceArea#1 177:7

185:[180, 181, 183]
  ServiceArea#1 177:6

new customer min#186
186:[180, 181, 183, 186]
  ServiceArea#1 177:5

187:[180, 181, 183, 186]
  ServiceArea#1 177:4

188:[180, 181, 183, 186]
  ServiceArea#1 177:3

189:[180, 181, 183, 186]
  ServiceArea#1 177:2

190:[180, 181, 183, 186]
  ServiceArea#1 177:1

Customer#177 leaves and his total wait time is 14
191:[181, 183, 186]
  ServiceArea#1 180:4

new customer min#192
192:[181, 183, 186, 192]
  ServiceArea#1 180:3

193:[181, 183, 186, 192]
  ServiceArea#1 180:2

194:[181, 183, 186, 192]
  ServiceArea#1 180:1

new customer min#195
Customer#180 leaves and his total wait time is 15
195:[183, 186, 192, 195]
  ServiceArea#1 181:3

196:[183, 186, 192, 195]
  ServiceArea#1 181:2

new customer min#197
197:[183, 186, 192, 195, 197]
  ServiceArea#1 181:1

Customer#181 leaves and his total wait time is 17
198:[186, 192, 195, 197]
  ServiceArea#1 183:5

199:[186, 192, 195, 197]
  ServiceArea#1 183:4

200:[186, 192, 195, 197]
  ServiceArea#1 183:3

201:[186, 192, 195, 197]
  ServiceArea#1 183:2

202:[186, 192, 195, 197]
  ServiceArea#1 183:1

new customer min#203
Customer#183 leaves and his total wait time is 20
203:[192, 195, 197, 203]
  ServiceArea#1 186:7

new customer min#204
204:[192, 195, 197, 203, 204]
  ServiceArea#1 186:6

205:[192, 195, 197, 203, 204]
  ServiceArea#1 186:5

206:[192, 195, 197, 203, 204]
  ServiceArea#1 186:4

new customer min#207
207:[192, 195, 197, 203, 204, 207]
  ServiceArea#1 186:3

208:[192, 195, 197, 203, 204, 207]
  ServiceArea#1 186:2

new customer min#209
209:[192, 195, 197, 203, 204, 207, 209]
  ServiceArea#1 186:1

new customer min#210
Customer#186 leaves and his total wait time is 24
210:[195, 197, 203, 204, 207, 209, 210]
  ServiceArea#1 192:4

211:[195, 197, 203, 204, 207, 209, 210]
  ServiceArea#1 192:3

212:[195, 197, 203, 204, 207, 209, 210]
  ServiceArea#1 192:2

213:[195, 197, 203, 204, 207, 209, 210]
  ServiceArea#1 192:1

Customer#192 leaves and his total wait time is 22
214:[197, 203, 204, 207, 209, 210]
  ServiceArea#1 195:2

215:[197, 203, 204, 207, 209, 210]
  ServiceArea#1 195:1

Customer#195 leaves and his total wait time is 21
216:[203, 204, 207, 209, 210]
  ServiceArea#1 197:5

new customer min#217
217:[203, 204, 207, 209, 210, 217]
  ServiceArea#1 197:4

218:[203, 204, 207, 209, 210, 217]
  ServiceArea#1 197:3

219:[203, 204, 207, 209, 210, 217]
  ServiceArea#1 197:2

220:[203, 204, 207, 209, 210, 217]
  ServiceArea#1 197:1

Customer#197 leaves and his total wait time is 24
221:[204, 207, 209, 210, 217]
  ServiceArea#1 203:6

222:[204, 207, 209, 210, 217]
  ServiceArea#1 203:5

223:[204, 207, 209, 210, 217]
  ServiceArea#1 203:4

224:[204, 207, 209, 210, 217]
  ServiceArea#1 203:3

new customer min#225
225:[204, 207, 209, 210, 217, 225]
  ServiceArea#1 203:2

226:[204, 207, 209, 210, 217, 225]
  ServiceArea#1 203:1

Customer#203 leaves and his total wait time is 24
227:[207, 209, 210, 217, 225]
  ServiceArea#1 204:7

new customer min#228
228:[207, 209, 210, 217, 225, 228]
  ServiceArea#1 204:6

229:[207, 209, 210, 217, 225, 228]
  ServiceArea#1 204:5

230:[207, 209, 210, 217, 225, 228]
  ServiceArea#1 204:4

231:[207, 209, 210, 217, 225, 228]
  ServiceArea#1 204:3

232:[207, 209, 210, 217, 225, 228]
  ServiceArea#1 204:2

233:[207, 209, 210, 217, 225, 228]
  ServiceArea#1 204:1

Customer#204 leaves and his total wait time is 30
234:[209, 210, 217, 225, 228]
  ServiceArea#1 207:4

new customer min#235
235:[209, 210, 217, 225, 228, 235]
  ServiceArea#1 207:3

236:[209, 210, 217, 225, 228, 235]
  ServiceArea#1 207:2

new customer min#237
237:[209, 210, 217, 225, 228, 235, 237]
  ServiceArea#1 207:1

Customer#207 leaves and his total wait time is 31
238:[210, 217, 225, 228, 235, 237]
  ServiceArea#1 209:7

239:[210, 217, 225, 228, 235, 237]
  ServiceArea#1 209:6

240:[210, 217, 225, 228, 235, 237]
  ServiceArea#1 209:5

241:[210, 217, 225, 228, 235, 237]
  ServiceArea#1 209:4

242:[210, 217, 225, 228, 235, 237]
  ServiceArea#1 209:3

243:[210, 217, 225, 228, 235, 237]
  ServiceArea#1 209:2

244:[210, 217, 225, 228, 235, 237]
  ServiceArea#1 209:1

Customer#209 leaves and his total wait time is 36
245:[217, 225, 228, 235, 237]
  ServiceArea#1 210:4

246:[217, 225, 228, 235, 237]
  ServiceArea#1 210:3

247:[217, 225, 228, 235, 237]
  ServiceArea#1 210:2

248:[217, 225, 228, 235, 237]
  ServiceArea#1 210:1

Customer#210 leaves and his total wait time is 39
249:[225, 228, 235, 237]
  ServiceArea#1 217:6

new customer min#250
250:[225, 228, 235, 237, 250]
  ServiceArea#1 217:5

251:[225, 228, 235, 237, 250]
  ServiceArea#1 217:4

252:[225, 228, 235, 237, 250]
  ServiceArea#1 217:3

253:[225, 228, 235, 237, 250]
  ServiceArea#1 217:2

254:[225, 228, 235, 237, 250]
  ServiceArea#1 217:1

Customer#217 leaves and his total wait time is 38
255:[228, 235, 237, 250]
  ServiceArea#1 225:7

256:[228, 235, 237, 250]
  ServiceArea#1 225:6

257:[228, 235, 237, 250]
  ServiceArea#1 225:5

new customer min#258
258:[228, 235, 237, 250, 258]
  ServiceArea#1 225:4

259:[228, 235, 237, 250, 258]
  ServiceArea#1 225:3

260:[228, 235, 237, 250, 258]
  ServiceArea#1 225:2

261:[228, 235, 237, 250, 258]
  ServiceArea#1 225:1

new customer min#262
Customer#225 leaves and his total wait time is 37
262:[235, 237, 250, 258, 262]
  ServiceArea#1 228:4

263:[235, 237, 250, 258, 262]
  ServiceArea#1 228:3

264:[235, 237, 250, 258, 262]
  ServiceArea#1 228:2

265:[235, 237, 250, 258, 262]
  ServiceArea#1 228:1

Customer#228 leaves and his total wait time is 38
266:[237, 250, 258, 262]
  ServiceArea#1 235:6

267:[237, 250, 258, 262]
  ServiceArea#1 235:5

268:[237, 250, 258, 262]
  ServiceArea#1 235:4

269:[237, 250, 258, 262]
  ServiceArea#1 235:3

270:[237, 250, 258, 262]
  ServiceArea#1 235:2

new customer min#271
271:[237, 250, 258, 262, 271]
  ServiceArea#1 235:1

Customer#235 leaves and his total wait time is 37
272:[250, 258, 262, 271]
  ServiceArea#1 237:7

273:[250, 258, 262, 271]
  ServiceArea#1 237:6

274:[250, 258, 262, 271]
  ServiceArea#1 237:5

275:[250, 258, 262, 271]
  ServiceArea#1 237:4

new customer min#276
276:[250, 258, 262, 271, 276]
  ServiceArea#1 237:3

277:[250, 258, 262, 271, 276]
  ServiceArea#1 237:2

new customer min#278
278:[250, 258, 262, 271, 276, 278]
  ServiceArea#1 237:1

Customer#237 leaves and his total wait time is 42
279:[258, 262, 271, 276, 278]
  ServiceArea#1 250:2

280:[258, 262, 271, 276, 278]
  ServiceArea#1 250:1

new customer min#281
Customer#250 leaves and his total wait time is 31
281:[262, 271, 276, 278, 281]
  ServiceArea#1 258:5

282:[262, 271, 276, 278, 281]
  ServiceArea#1 258:4

283:[262, 271, 276, 278, 281]
  ServiceArea#1 258:3

284:[262, 271, 276, 278, 281]
  ServiceArea#1 258:2

new customer min#285
285:[262, 271, 276, 278, 281, 285]
  ServiceArea#1 258:1

new customer min#286
Customer#258 leaves and his total wait time is 28
286:[271, 276, 278, 281, 285, 286]
  ServiceArea#1 262:4

287:[271, 276, 278, 281, 285, 286]
  ServiceArea#1 262:3

288:[271, 276, 278, 281, 285, 286]
  ServiceArea#1 262:2

new customer min#289
289:[271, 276, 278, 281, 285, 286, 289]
  ServiceArea#1 262:1

Customer#262 leaves and his total wait time is 28
290:[276, 278, 281, 285, 286, 289]
  ServiceArea#1 271:6

291:[276, 278, 281, 285, 286, 289]
  ServiceArea#1 271:5

292:[276, 278, 281, 285, 286, 289]
  ServiceArea#1 271:4

293:[276, 278, 281, 285, 286, 289]
  ServiceArea#1 271:3

294:[276, 278, 281, 285, 286, 289]
  ServiceArea#1 271:2

295:[276, 278, 281, 285, 286, 289]
  ServiceArea#1 271:1

Customer#271 leaves and his total wait time is 25
296:[278, 281, 285, 286, 289]
  ServiceArea#1 276:7

297:[278, 281, 285, 286, 289]
  ServiceArea#1 276:6

298:[278, 281, 285, 286, 289]
  ServiceArea#1 276:5

299:[278, 281, 285, 286, 289]
  ServiceArea#1 276:4

300:[278, 281, 285, 286, 289]
  ServiceArea#1 276:3

301:[278, 281, 285, 286, 289]
  ServiceArea#1 276:2

302:[278, 281, 285, 286, 289]
  ServiceArea#1 276:1

Customer#276 leaves and his total wait time is 27
303:[281, 285, 286, 289]
  ServiceArea#1 278:6

304:[281, 285, 286, 289]
  ServiceArea#1 278:5

305:[281, 285, 286, 289]
  ServiceArea#1 278:4

306:[281, 285, 286, 289]
  ServiceArea#1 278:3

307:[281, 285, 286, 289]
  ServiceArea#1 278:2

308:[281, 285, 286, 289]
  ServiceArea#1 278:1

Customer#278 leaves and his total wait time is 31
309:[285, 286, 289]
  ServiceArea#1 281:5

310:[285, 286, 289]
  ServiceArea#1 281:4

311:[285, 286, 289]
  ServiceArea#1 281:3

312:[285, 286, 289]
  ServiceArea#1 281:2

new customer min#313
313:[285, 286, 289, 313]
  ServiceArea#1 281:1

Customer#281 leaves and his total wait time is 33
314:[286, 289, 313]
  ServiceArea#1 285:2

new customer min#315
315:[286, 289, 313, 315]
  ServiceArea#1 285:1

Customer#285 leaves and his total wait time is 31
316:[289, 313, 315]
  ServiceArea#1 286:6

new customer min#317
317:[289, 313, 315, 317]
  ServiceArea#1 286:5

318:[289, 313, 315, 317]
  ServiceArea#1 286:4

319:[289, 313, 315, 317]
  ServiceArea#1 286:3

320:[289, 313, 315, 317]
  ServiceArea#1 286:2

321:[289, 313, 315, 317]
  ServiceArea#1 286:1

Customer#286 leaves and his total wait time is 36
322:[313, 315, 317]
  ServiceArea#1 289:3

323:[313, 315, 317]
  ServiceArea#1 289:2

324:[313, 315, 317]
  ServiceArea#1 289:1

Customer#289 leaves and his total wait time is 36
325:[315, 317]
  ServiceArea#1 313:2

326:[315, 317]
  ServiceArea#1 313:1

Customer#313 leaves and his total wait time is 14
327:[317]
  ServiceArea#1 315:3

new customer min#328
328:[317, 328]
  ServiceArea#1 315:2

new customer min#329
329:[317, 328, 329]
  ServiceArea#1 315:1

Customer#315 leaves and his total wait time is 15
330:[328, 329]
  ServiceArea#1 317:4

331:[328, 329]
  ServiceArea#1 317:3

new customer min#332
332:[328, 329, 332]
  ServiceArea#1 317:2

333:[328, 329, 332]
  ServiceArea#1 317:1

Customer#317 leaves and his total wait time is 17
334:[329, 332]
  ServiceArea#1 328:5

335:[329, 332]
  ServiceArea#1 328:4

336:[329, 332]
  ServiceArea#1 328:3

337:[329, 332]
  ServiceArea#1 328:2

338:[329, 332]
  ServiceArea#1 328:1

Customer#328 leaves and his total wait time is 11
339:[332]
  ServiceArea#1 329:7

new customer min#340
340:[332, 340]
  ServiceArea#1 329:6

new customer min#341
341:[332, 340, 341]
  ServiceArea#1 329:5

new customer min#342
342:[332, 340, 341, 342]
  ServiceArea#1 329:4

343:[332, 340, 341, 342]
  ServiceArea#1 329:3

344:[332, 340, 341, 342]
  ServiceArea#1 329:2

345:[332, 340, 341, 342]
  ServiceArea#1 329:1

Customer#329 leaves and his total wait time is 17
346:[340, 341, 342]
  ServiceArea#1 332:3

347:[340, 341, 342]
  ServiceArea#1 332:2

348:[340, 341, 342]
  ServiceArea#1 332:1

Customer#332 leaves and his total wait time is 17
349:[341, 342]
  ServiceArea#1 340:6

350:[341, 342]
  ServiceArea#1 340:5

351:[341, 342]
  ServiceArea#1 340:4

352:[341, 342]
  ServiceArea#1 340:3

353:[341, 342]
  ServiceArea#1 340:2

354:[341, 342]
  ServiceArea#1 340:1

Customer#340 leaves and his total wait time is 15
355:[342]
  ServiceArea#1 341:7

356:[342]
  ServiceArea#1 341:6

357:[342]
  ServiceArea#1 341:5

358:[342]
  ServiceArea#1 341:4

359:[342]
  ServiceArea#1 341:3

360:[342]
  ServiceArea#1 341:2

361:[342]
  ServiceArea#1 341:1

new customer min#362
Customer#341 leaves and his total wait time is 21
362:[362]
  ServiceArea#1 342:5

new customer min#363
363:[362, 363]
  ServiceArea#1 342:4

new customer min#364
364:[362, 363, 364]
  ServiceArea#1 342:3

365:[362, 363, 364]
  ServiceArea#1 342:2

new customer min#366
366:[362, 363, 364, 366]
  ServiceArea#1 342:1

Customer#342 leaves and his total wait time is 25
367:[363, 364, 366]
  ServiceArea#1 362:6

368:[363, 364, 366]
  ServiceArea#1 362:5

369:[363, 364, 366]
  ServiceArea#1 362:4

370:[363, 364, 366]
  ServiceArea#1 362:3

371:[363, 364, 366]
  ServiceArea#1 362:2

372:[363, 364, 366]
  ServiceArea#1 362:1

Customer#362 leaves and his total wait time is 11
373:[364, 366]
  ServiceArea#1 363:6

374:[364, 366]
  ServiceArea#1 363:5

375:[364, 366]
  ServiceArea#1 363:4

376:[364, 366]
  ServiceArea#1 363:3

377:[364, 366]
  ServiceArea#1 363:2

378:[364, 366]
  ServiceArea#1 363:1

new customer min#379
Customer#363 leaves and his total wait time is 16
379:[366, 379]
  ServiceArea#1 364:6

380:[366, 379]
  ServiceArea#1 364:5

381:[366, 379]
  ServiceArea#1 364:4

382:[366, 379]
  ServiceArea#1 364:3

383:[366, 379]
  ServiceArea#1 364:2

384:[366, 379]
  ServiceArea#1 364:1

Customer#364 leaves and his total wait time is 21
385:[379]
  ServiceArea#1 366:2

386:[379]
  ServiceArea#1 366:1

new customer min#387
Customer#366 leaves and his total wait time is 21
387:[387]
  ServiceArea#1 379:7

388:[387]
  ServiceArea#1 379:6

new customer min#389
389:[387, 389]
  ServiceArea#1 379:5

390:[387, 389]
  ServiceArea#1 379:4

391:[387, 389]
  ServiceArea#1 379:3

392:[387, 389]
  ServiceArea#1 379:2

393:[387, 389]
  ServiceArea#1 379:1

Customer#379 leaves and his total wait time is 15
394:[389]
  ServiceArea#1 387:2

395:[389]
  ServiceArea#1 387:1

Customer#387 leaves and his total wait time is 9
396:[]
  ServiceArea#1 389:2

new customer min#397
397:[397]
  ServiceArea#1 389:1

Customer#389 leaves and his total wait time is 9
398:[]
  ServiceArea#1 397:2

new customer min#399
399:[399]
  ServiceArea#1 397:1

Customer#397 leaves and his total wait time is 3
400:[]
  ServiceArea#1 399:2

401:[]
  ServiceArea#1 399:1

Customer#399 leaves and his total wait time is 3
402:[]
  ServiceArea#1 -1:-1

403:[]
  ServiceArea#1 -1:-1

404:[]
  ServiceArea#1 -1:-1

405:[]
  ServiceArea#1 -1:-1

406:[]
  ServiceArea#1 -1:-1

407:[]
  ServiceArea#1 -1:-1

408:[]
  ServiceArea#1 -1:-1

409:[]
  ServiceArea#1 -1:-1

410:[]
  ServiceArea#1 -1:-1

411:[]
  ServiceArea#1 -1:-1

new customer min#412
412:[]
  ServiceArea#1 412:5

413:[]
  ServiceArea#1 412:4

414:[]
  ServiceArea#1 412:3

415:[]
  ServiceArea#1 412:2

416:[]
  ServiceArea#1 412:1

Customer#412 leaves and his total wait time is 5
417:[]
  ServiceArea#1 -1:-1

418:[]
  ServiceArea#1 -1:-1

419:[]
  ServiceArea#1 -1:-1

420:[]
  ServiceArea#1 -1:-1

421:[]
  ServiceArea#1 -1:-1

422:[]
  ServiceArea#1 -1:-1

423:[]
  ServiceArea#1 -1:-1

424:[]
  ServiceArea#1 -1:-1

new customer min#425
425:[]
  ServiceArea#1 425:4

new customer min#426
426:[426]
  ServiceArea#1 425:3

427:[426]
  ServiceArea#1 425:2

new customer min#428
428:[426, 428]
  ServiceArea#1 425:1

Customer#425 leaves and his total wait time is 4
429:[428]
  ServiceArea#1 426:5

430:[428]
  ServiceArea#1 426:4

431:[428]
  ServiceArea#1 426:3

432:[428]
  ServiceArea#1 426:2

433:[428]
  ServiceArea#1 426:1

Customer#426 leaves and his total wait time is 8
434:[]
  ServiceArea#1 428:6

435:[]
  ServiceArea#1 428:5

436:[]
  ServiceArea#1 428:4

new customer min#437
437:[437]
  ServiceArea#1 428:3

438:[437]
  ServiceArea#1 428:2

439:[437]
  ServiceArea#1 428:1

Customer#428 leaves and his total wait time is 12
440:[]
  ServiceArea#1 437:5

441:[]
  ServiceArea#1 437:4

new customer min#442
442:[442]
  ServiceArea#1 437:3

443:[442]
  ServiceArea#1 437:2

444:[442]
  ServiceArea#1 437:1

Customer#437 leaves and his total wait time is 8
445:[]
  ServiceArea#1 442:4

446:[]
  ServiceArea#1 442:3

447:[]
  ServiceArea#1 442:2

448:[]
  ServiceArea#1 442:1

Customer#442 leaves and his total wait time is 7
449:[]
  ServiceArea#1 -1:-1

450:[]
  ServiceArea#1 -1:-1

451:[]
  ServiceArea#1 -1:-1

new customer min#452
452:[]
  ServiceArea#1 452:5

453:[]
  ServiceArea#1 452:4

454:[]
  ServiceArea#1 452:3

455:[]
  ServiceArea#1 452:2

new customer min#456
456:[456]
  ServiceArea#1 452:1

Customer#452 leaves and his total wait time is 5
457:[]
  ServiceArea#1 456:3

458:[]
  ServiceArea#1 456:2

459:[]
  ServiceArea#1 456:1

new customer min#460
Customer#456 leaves and his total wait time is 4
460:[]
  ServiceArea#1 460:3

461:[]
  ServiceArea#1 460:2

462:[]
  ServiceArea#1 460:1

Customer#460 leaves and his total wait time is 3
463:[]
  ServiceArea#1 -1:-1

464:[]
  ServiceArea#1 -1:-1

465:[]
  ServiceArea#1 -1:-1

new customer min#466
466:[]
  ServiceArea#1 466:7

467:[]
  ServiceArea#1 466:6

468:[]
  ServiceArea#1 466:5

469:[]
  ServiceArea#1 466:4

470:[]
  ServiceArea#1 466:3

471:[]
  ServiceArea#1 466:2

472:[]
  ServiceArea#1 466:1

Customer#466 leaves and his total wait time is 7
473:[]
  ServiceArea#1 -1:-1

474:[]
  ServiceArea#1 -1:-1

475:[]
  ServiceArea#1 -1:-1

new customer min#476
476:[]
  ServiceArea#1 476:4

477:[]
  ServiceArea#1 476:3

478:[]
  ServiceArea#1 476:2

479:[]
  ServiceArea#1 476:1

Customer#476 leaves and his total wait time is 4
480:[]
  ServiceArea#1 -1:-1

new customer min#481
481:[]
  ServiceArea#1 481:6

482:[]
  ServiceArea#1 481:5

483:[]
  ServiceArea#1 481:4

484:[]
  ServiceArea#1 481:3

485:[]
  ServiceArea#1 481:2

new customer min#486
486:[486]
  ServiceArea#1 481:1

Customer#481 leaves and his total wait time is 6
487:[]
  ServiceArea#1 486:7

new customer min#488
488:[488]
  ServiceArea#1 486:6

489:[488]
  ServiceArea#1 486:5

490:[488]
  ServiceArea#1 486:4

491:[488]
  ServiceArea#1 486:3

492:[488]
  ServiceArea#1 486:2

493:[488]
  ServiceArea#1 486:1

Customer#486 leaves and his total wait time is 8
494:[]
  ServiceArea#1 488:5

495:[]
  ServiceArea#1 488:4

496:[]
  ServiceArea#1 488:3

497:[]
  ServiceArea#1 488:2

498:[]
  ServiceArea#1 488:1

new customer min#499
Customer#488 leaves and his total wait time is 11
499:[]
  ServiceArea#1 499:6

500:[]
  ServiceArea#1 499:5

501:[]
  ServiceArea#1 499:4

502:[]
  ServiceArea#1 499:3

503:[]
  ServiceArea#1 499:2

504:[]
  ServiceArea#1 499:1

Customer#499 leaves and his total wait time is 6
505:[]
  ServiceArea#1 -1:-1

506:[]
  ServiceArea#1 -1:-1

507:[]
  ServiceArea#1 -1:-1

508:[]
  ServiceArea#1 -1:-1

509:[]
  ServiceArea#1 -1:-1

510:[]
  ServiceArea#1 -1:-1

511:[]
  ServiceArea#1 -1:-1

512:[]
  ServiceArea#1 -1:-1

513:[]
  ServiceArea#1 -1:-1

514:[]
  ServiceArea#1 -1:-1

new customer min#515
515:[]
  ServiceArea#1 515:4

new customer min#516
516:[516]
  ServiceArea#1 515:3

517:[516]
  ServiceArea#1 515:2

518:[516]
  ServiceArea#1 515:1

Customer#515 leaves and his total wait time is 4
519:[]
  ServiceArea#1 516:5

new customer min#520
520:[520]
  ServiceArea#1 516:4

521:[520]
  ServiceArea#1 516:3

522:[520]
  ServiceArea#1 516:2

523:[520]
  ServiceArea#1 516:1

Customer#516 leaves and his total wait time is 8
524:[]
  ServiceArea#1 520:6

525:[]
  ServiceArea#1 520:5

526:[]
  ServiceArea#1 520:4

527:[]
  ServiceArea#1 520:3

528:[]
  ServiceArea#1 520:2

new customer min#529
529:[529]
  ServiceArea#1 520:1

Customer#520 leaves and his total wait time is 10
530:[]
  ServiceArea#1 529:2

531:[]
  ServiceArea#1 529:1

Customer#529 leaves and his total wait time is 3
532:[]
  ServiceArea#1 -1:-1

533:[]
  ServiceArea#1 -1:-1

534:[]
  ServiceArea#1 -1:-1

535:[]
  ServiceArea#1 -1:-1

536:[]
  ServiceArea#1 -1:-1

537:[]
  ServiceArea#1 -1:-1

538:[]
  ServiceArea#1 -1:-1

new customer min#539
539:[]
  ServiceArea#1 539:3

540:[]
  ServiceArea#1 539:2

541:[]
  ServiceArea#1 539:1

Customer#539 leaves and his total wait time is 3
542:[]
  ServiceArea#1 -1:-1

543:[]
  ServiceArea#1 -1:-1

544:[]
  ServiceArea#1 -1:-1

545:[]
  ServiceArea#1 -1:-1

new customer min#546
546:[]
  ServiceArea#1 546:5

547:[]
  ServiceArea#1 546:4

548:[]
  ServiceArea#1 546:3

549:[]
  ServiceArea#1 546:2

new customer min#550
550:[550]
  ServiceArea#1 546:1

Customer#546 leaves and his total wait time is 5
551:[]
  ServiceArea#1 550:7

new customer min#552
552:[552]
  ServiceArea#1 550:6

553:[552]
  ServiceArea#1 550:5

554:[552]
  ServiceArea#1 550:4

555:[552]
  ServiceArea#1 550:3

556:[552]
  ServiceArea#1 550:2

557:[552]
  ServiceArea#1 550:1

Customer#550 leaves and his total wait time is 8
558:[]
  ServiceArea#1 552:2

559:[]
  ServiceArea#1 552:1

Customer#552 leaves and his total wait time is 8
560:[]
  ServiceArea#1 -1:-1

561:[]
  ServiceArea#1 -1:-1

562:[]
  ServiceArea#1 -1:-1

563:[]
  ServiceArea#1 -1:-1

new customer min#564
564:[]
  ServiceArea#1 564:4

565:[]
  ServiceArea#1 564:3

new customer min#566
566:[566]
  ServiceArea#1 564:2

567:[566]
  ServiceArea#1 564:1

Customer#564 leaves and his total wait time is 4
568:[]
  ServiceArea#1 566:4

569:[]
  ServiceArea#1 566:3

570:[]
  ServiceArea#1 566:2

571:[]
  ServiceArea#1 566:1

Customer#566 leaves and his total wait time is 6
572:[]
  ServiceArea#1 -1:-1

573:[]
  ServiceArea#1 -1:-1

574:[]
  ServiceArea#1 -1:-1

575:[]
  ServiceArea#1 -1:-1

new customer min#576
576:[]
  ServiceArea#1 576:5

577:[]
  ServiceArea#1 576:4

578:[]
  ServiceArea#1 576:3

579:[]
  ServiceArea#1 576:2

580:[]
  ServiceArea#1 576:1

new customer min#581
Customer#576 leaves and his total wait time is 5
581:[]
  ServiceArea#1 581:3

582:[]
  ServiceArea#1 581:2

583:[]
  ServiceArea#1 581:1

Customer#581 leaves and his total wait time is 3
584:[]
  ServiceArea#1 -1:-1

new customer min#585
585:[]
  ServiceArea#1 585:3

586:[]
  ServiceArea#1 585:2

587:[]
  ServiceArea#1 585:1

Customer#585 leaves and his total wait time is 3
588:[]
  ServiceArea#1 -1:-1

589:[]
  ServiceArea#1 -1:-1

590:[]
  ServiceArea#1 -1:-1

591:[]
  ServiceArea#1 -1:-1

592:[]
  ServiceArea#1 -1:-1

593:[]
  ServiceArea#1 -1:-1

new customer min#594
594:[]
  ServiceArea#1 594:2

595:[]
  ServiceArea#1 594:1

Customer#594 leaves and his total wait time is 2
596:[]
  ServiceArea#1 -1:-1

597:[]
  ServiceArea#1 -1:-1

598:[]
  ServiceArea#1 -1:-1

599:[]
  ServiceArea#1 -1:-1

new customer min#600
600:[]
  ServiceArea#1 600:7

601:[]
  ServiceArea#1 600:6

602:[]
  ServiceArea#1 600:5

new customer min#603
603:[603]
  ServiceArea#1 600:4

604:[603]
  ServiceArea#1 600:3

605:[603]
  ServiceArea#1 600:2

606:[603]
  ServiceArea#1 600:1

Customer#600 leaves and his total wait time is 7
607:[]
  ServiceArea#1 603:4

608:[]
  ServiceArea#1 603:3

609:[]
  ServiceArea#1 603:2

610:[]
  ServiceArea#1 603:1

new customer min#611
Customer#603 leaves and his total wait time is 8
611:[]
  ServiceArea#1 611:6

612:[]
  ServiceArea#1 611:5

613:[]
  ServiceArea#1 611:4

614:[]
  ServiceArea#1 611:3

615:[]
  ServiceArea#1 611:2

616:[]
  ServiceArea#1 611:1

Customer#611 leaves and his total wait time is 6
617:[]
  ServiceArea#1 -1:-1

618:[]
  ServiceArea#1 -1:-1

619:[]
  ServiceArea#1 -1:-1

new customer min#620
620:[]
  ServiceArea#1 620:2

621:[]
  ServiceArea#1 620:1

Customer#620 leaves and his total wait time is 2
622:[]
  ServiceArea#1 -1:-1

623:[]
  ServiceArea#1 -1:-1

624:[]
  ServiceArea#1 -1:-1

new customer min#625
625:[]
  ServiceArea#1 625:7

626:[]
  ServiceArea#1 625:6

627:[]
  ServiceArea#1 625:5

628:[]
  ServiceArea#1 625:4

629:[]
  ServiceArea#1 625:3

630:[]
  ServiceArea#1 625:2

631:[]
  ServiceArea#1 625:1

Customer#625 leaves and his total wait time is 7
632:[]
  ServiceArea#1 -1:-1

633:[]
  ServiceArea#1 -1:-1

634:[]
  ServiceArea#1 -1:-1

635:[]
  ServiceArea#1 -1:-1

636:[]
  ServiceArea#1 -1:-1

637:[]
  ServiceArea#1 -1:-1

638:[]
  ServiceArea#1 -1:-1

639:[]
  ServiceArea#1 -1:-1

new customer min#640
640:[]
  ServiceArea#1 640:4

new customer min#641
641:[641]
  ServiceArea#1 640:3

new customer min#642
642:[641, 642]
  ServiceArea#1 640:2

643:[641, 642]
  ServiceArea#1 640:1

Customer#640 leaves and his total wait time is 4
644:[642]
  ServiceArea#1 641:4

new customer min#645
645:[642, 645]
  ServiceArea#1 641:3

646:[642, 645]
  ServiceArea#1 641:2

647:[642, 645]
  ServiceArea#1 641:1

Customer#641 leaves and his total wait time is 7
648:[645]
  ServiceArea#1 642:4

649:[645]
  ServiceArea#1 642:3

650:[645]
  ServiceArea#1 642:2

651:[645]
  ServiceArea#1 642:1

Customer#642 leaves and his total wait time is 10
652:[]
  ServiceArea#1 645:2

653:[]
  ServiceArea#1 645:1

Customer#645 leaves and his total wait time is 9
654:[]
  ServiceArea#1 -1:-1

655:[]
  ServiceArea#1 -1:-1

656:[]
  ServiceArea#1 -1:-1

657:[]
  ServiceArea#1 -1:-1

658:[]
  ServiceArea#1 -1:-1

659:[]
  ServiceArea#1 -1:-1

660:[]
  ServiceArea#1 -1:-1

new customer min#661
661:[]
  ServiceArea#1 661:4

662:[]
  ServiceArea#1 661:3

663:[]
  ServiceArea#1 661:2

664:[]
  ServiceArea#1 661:1

new customer min#665
Customer#661 leaves and his total wait time is 4
665:[]
  ServiceArea#1 665:7

666:[]
  ServiceArea#1 665:6

667:[]
  ServiceArea#1 665:5

668:[]
  ServiceArea#1 665:4

669:[]
  ServiceArea#1 665:3

670:[]
  ServiceArea#1 665:2

671:[]
  ServiceArea#1 665:1

Customer#665 leaves and his total wait time is 7
672:[]
  ServiceArea#1 -1:-1

new customer min#673
673:[]
  ServiceArea#1 673:2

674:[]
  ServiceArea#1 673:1

Customer#673 leaves and his total wait time is 2
675:[]
  ServiceArea#1 -1:-1

new customer min#676
676:[]
  ServiceArea#1 676:4

677:[]
  ServiceArea#1 676:3

678:[]
  ServiceArea#1 676:2

679:[]
  ServiceArea#1 676:1

Customer#676 leaves and his total wait time is 4
680:[]
  ServiceArea#1 -1:-1

681:[]
  ServiceArea#1 -1:-1

682:[]
  ServiceArea#1 -1:-1

683:[]
  ServiceArea#1 -1:-1

684:[]
  ServiceArea#1 -1:-1

685:[]
  ServiceArea#1 -1:-1

new customer min#686
686:[]
  ServiceArea#1 686:7

687:[]
  ServiceArea#1 686:6

new customer min#688
688:[688]
  ServiceArea#1 686:5

689:[688]
  ServiceArea#1 686:4

690:[688]
  ServiceArea#1 686:3

691:[688]
  ServiceArea#1 686:2

new customer min#692
692:[688, 692]
  ServiceArea#1 686:1

new customer min#693
Customer#686 leaves and his total wait time is 7
693:[692, 693]
  ServiceArea#1 688:2

694:[692, 693]
  ServiceArea#1 688:1

Customer#688 leaves and his total wait time is 7
695:[693]
  ServiceArea#1 692:6

696:[693]
  ServiceArea#1 692:5

697:[693]
  ServiceArea#1 692:4

698:[693]
  ServiceArea#1 692:3

699:[693]
  ServiceArea#1 692:2

700:[693]
  ServiceArea#1 692:1

Customer#692 leaves and his total wait time is 9
701:[]
  ServiceArea#1 693:3

702:[]
  ServiceArea#1 693:2

703:[]
  ServiceArea#1 693:1

Customer#693 leaves and his total wait time is 11
704:[]
  ServiceArea#1 -1:-1

705:[]
  ServiceArea#1 -1:-1

new customer min#706
706:[]
  ServiceArea#1 706:5

707:[]
  ServiceArea#1 706:4

708:[]
  ServiceArea#1 706:3

709:[]
  ServiceArea#1 706:2

710:[]
  ServiceArea#1 706:1

Customer#706 leaves and his total wait time is 5
711:[]
  ServiceArea#1 -1:-1

712:[]
  ServiceArea#1 -1:-1

713:[]
  ServiceArea#1 -1:-1

new customer min#714
714:[]
  ServiceArea#1 714:6

715:[]
  ServiceArea#1 714:5

new customer min#716
716:[716]
  ServiceArea#1 714:4

new customer min#717
717:[716, 717]
  ServiceArea#1 714:3

718:[716, 717]
  ServiceArea#1 714:2

719:[716, 717]
  ServiceArea#1 714:1

Customer#714 leaves and his total wait time is 6
720:[717]
  ServiceArea#1 716:6

721:[717]
  ServiceArea#1 716:5

722:[717]
  ServiceArea#1 716:4

723:[717]
  ServiceArea#1 716:3

724:[717]
  ServiceArea#1 716:2

new customer min#725
725:[717, 725]
  ServiceArea#1 716:1

Customer#716 leaves and his total wait time is 10
726:[725]
  ServiceArea#1 717:4

727:[725]
  ServiceArea#1 717:3

728:[725]
  ServiceArea#1 717:2

new customer min#729
729:[725, 729]
  ServiceArea#1 717:1

Customer#717 leaves and his total wait time is 13
730:[729]
  ServiceArea#1 725:7

731:[729]
  ServiceArea#1 725:6

732:[729]
  ServiceArea#1 725:5

733:[729]
  ServiceArea#1 725:4

734:[729]
  ServiceArea#1 725:3

735:[729]
  ServiceArea#1 725:2

736:[729]
  ServiceArea#1 725:1

Customer#725 leaves and his total wait time is 12
737:[]
  ServiceArea#1 729:3

new customer min#738
738:[738]
  ServiceArea#1 729:2

739:[738]
  ServiceArea#1 729:1

Customer#729 leaves and his total wait time is 11
740:[]
  ServiceArea#1 738:3

new customer min#741
741:[741]
  ServiceArea#1 738:2

742:[741]
  ServiceArea#1 738:1

Customer#738 leaves and his total wait time is 5
743:[]
  ServiceArea#1 741:5

744:[]
  ServiceArea#1 741:4

745:[]
  ServiceArea#1 741:3

746:[]
  ServiceArea#1 741:2

747:[]
  ServiceArea#1 741:1

Customer#741 leaves and his total wait time is 7
748:[]
  ServiceArea#1 -1:-1

749:[]
  ServiceArea#1 -1:-1

new customer min#750
750:[]
  ServiceArea#1 750:7

new customer min#751
751:[751]
  ServiceArea#1 750:6

752:[751]
  ServiceArea#1 750:5

753:[751]
  ServiceArea#1 750:4

new customer min#754
754:[751, 754]
  ServiceArea#1 750:3

755:[751, 754]
  ServiceArea#1 750:2

756:[751, 754]
  ServiceArea#1 750:1

Customer#750 leaves and his total wait time is 7
757:[754]
  ServiceArea#1 751:3

758:[754]
  ServiceArea#1 751:2

759:[754]
  ServiceArea#1 751:1

new customer min#760
Customer#751 leaves and his total wait time is 9
760:[760]
  ServiceArea#1 754:2

new customer min#761
761:[760, 761]
  ServiceArea#1 754:1

Customer#754 leaves and his total wait time is 8
762:[761]
  ServiceArea#1 760:4

763:[761]
  ServiceArea#1 760:3

764:[761]
  ServiceArea#1 760:2

765:[761]
  ServiceArea#1 760:1

Customer#760 leaves and his total wait time is 6
766:[]
  ServiceArea#1 761:7

767:[]
  ServiceArea#1 761:6

768:[]
  ServiceArea#1 761:5

769:[]
  ServiceArea#1 761:4

770:[]
  ServiceArea#1 761:3

new customer min#771
771:[771]
  ServiceArea#1 761:2

772:[771]
  ServiceArea#1 761:1

Customer#761 leaves and his total wait time is 12
773:[]
  ServiceArea#1 771:4

774:[]
  ServiceArea#1 771:3

new customer min#775
775:[775]
  ServiceArea#1 771:2

776:[775]
  ServiceArea#1 771:1

Customer#771 leaves and his total wait time is 6
777:[]
  ServiceArea#1 775:4

778:[]
  ServiceArea#1 775:3

779:[]
  ServiceArea#1 775:2

780:[]
  ServiceArea#1 775:1

Customer#775 leaves and his total wait time is 6
781:[]
  ServiceArea#1 -1:-1

782:[]
  ServiceArea#1 -1:-1

783:[]
  ServiceArea#1 -1:-1

new customer min#784
784:[]
  ServiceArea#1 784:4

785:[]
  ServiceArea#1 784:3

786:[]
  ServiceArea#1 784:2

787:[]
  ServiceArea#1 784:1

Customer#784 leaves and his total wait time is 4
788:[]
  ServiceArea#1 -1:-1

789:[]
  ServiceArea#1 -1:-1

790:[]
  ServiceArea#1 -1:-1

791:[]
  ServiceArea#1 -1:-1

792:[]
  ServiceArea#1 -1:-1

793:[]
  ServiceArea#1 -1:-1

794:[]
  ServiceArea#1 -1:-1

795:[]
  ServiceArea#1 -1:-1

796:[]
  ServiceArea#1 -1:-1

797:[]
  ServiceArea#1 -1:-1

798:[]
  ServiceArea#1 -1:-1

799:[]
  ServiceArea#1 -1:-1

800:[]
  ServiceArea#1 -1:-1

801:[]
  ServiceArea#1 -1:-1

802:[]
  ServiceArea#1 -1:-1

new customer min#803
803:[]
  ServiceArea#1 803:2

804:[]
  ServiceArea#1 803:1

Customer#803 leaves and his total wait time is 2
805:[]
  ServiceArea#1 -1:-1

806:[]
  ServiceArea#1 -1:-1

807:[]
  ServiceArea#1 -1:-1

new customer min#808
808:[]
  ServiceArea#1 808:6

809:[]
  ServiceArea#1 808:5

810:[]
  ServiceArea#1 808:4

new customer min#811
811:[811]
  ServiceArea#1 808:3

812:[811]
  ServiceArea#1 808:2

new customer min#813
813:[811, 813]
  ServiceArea#1 808:1

Customer#808 leaves and his total wait time is 6
814:[813]
  ServiceArea#1 811:2

new customer min#815
815:[813, 815]
  ServiceArea#1 811:1

new customer min#816
Customer#811 leaves and his total wait time is 5
816:[815, 816]
  ServiceArea#1 813:5

new customer min#817
817:[815, 816, 817]
  ServiceArea#1 813:4

818:[815, 816, 817]
  ServiceArea#1 813:3

819:[815, 816, 817]
  ServiceArea#1 813:2

820:[815, 816, 817]
  ServiceArea#1 813:1

Customer#813 leaves and his total wait time is 8
821:[816, 817]
  ServiceArea#1 815:3

822:[816, 817]
  ServiceArea#1 815:2

823:[816, 817]
  ServiceArea#1 815:1

Customer#815 leaves and his total wait time is 9
824:[817]
  ServiceArea#1 816:3

new customer min#825
825:[817, 825]
  ServiceArea#1 816:2

826:[817, 825]
  ServiceArea#1 816:1

Customer#816 leaves and his total wait time is 11
827:[825]
  ServiceArea#1 817:3

828:[825]
  ServiceArea#1 817:2

829:[825]
  ServiceArea#1 817:1

Customer#817 leaves and his total wait time is 13
830:[]
  ServiceArea#1 825:2

831:[]
  ServiceArea#1 825:1

new customer min#832
Customer#825 leaves and his total wait time is 7
832:[]
  ServiceArea#1 832:3

833:[]
  ServiceArea#1 832:2

834:[]
  ServiceArea#1 832:1

Customer#832 leaves and his total wait time is 3
835:[]
  ServiceArea#1 -1:-1

836:[]
  ServiceArea#1 -1:-1

837:[]
  ServiceArea#1 -1:-1

838:[]
  ServiceArea#1 -1:-1

839:[]
  ServiceArea#1 -1:-1

840:[]
  ServiceArea#1 -1:-1

841:[]
  ServiceArea#1 -1:-1

842:[]
  ServiceArea#1 -1:-1

843:[]
  ServiceArea#1 -1:-1

844:[]
  ServiceArea#1 -1:-1

new customer min#845
845:[]
  ServiceArea#1 845:7

846:[]
  ServiceArea#1 845:6

847:[]
  ServiceArea#1 845:5

848:[]
  ServiceArea#1 845:4

849:[]
  ServiceArea#1 845:3

new customer min#850
850:[850]
  ServiceArea#1 845:2

851:[850]
  ServiceArea#1 845:1

Customer#845 leaves and his total wait time is 7
852:[]
  ServiceArea#1 850:5

new customer min#853
853:[853]
  ServiceArea#1 850:4

854:[853]
  ServiceArea#1 850:3

855:[853]
  ServiceArea#1 850:2

856:[853]
  ServiceArea#1 850:1

Customer#850 leaves and his total wait time is 7
857:[]
  ServiceArea#1 853:5

858:[]
  ServiceArea#1 853:4

859:[]
  ServiceArea#1 853:3

860:[]
  ServiceArea#1 853:2

861:[]
  ServiceArea#1 853:1

Customer#853 leaves and his total wait time is 9
862:[]
  ServiceArea#1 -1:-1

863:[]
  ServiceArea#1 -1:-1

864:[]
  ServiceArea#1 -1:-1

865:[]
  ServiceArea#1 -1:-1

866:[]
  ServiceArea#1 -1:-1

867:[]
  ServiceArea#1 -1:-1

868:[]
  ServiceArea#1 -1:-1

869:[]
  ServiceArea#1 -1:-1

870:[]
  ServiceArea#1 -1:-1

new customer min#871
871:[]
  ServiceArea#1 871:7

872:[]
  ServiceArea#1 871:6

873:[]
  ServiceArea#1 871:5

874:[]
  ServiceArea#1 871:4

875:[]
  ServiceArea#1 871:3

876:[]
  ServiceArea#1 871:2

new customer min#877
877:[877]
  ServiceArea#1 871:1

Customer#871 leaves and his total wait time is 7
878:[]
  ServiceArea#1 877:5

879:[]
  ServiceArea#1 877:4

880:[]
  ServiceArea#1 877:3

881:[]
  ServiceArea#1 877:2

882:[]
  ServiceArea#1 877:1

Customer#877 leaves and his total wait time is 6
883:[]
  ServiceArea#1 -1:-1

884:[]
  ServiceArea#1 -1:-1

885:[]
  ServiceArea#1 -1:-1

886:[]
  ServiceArea#1 -1:-1

887:[]
  ServiceArea#1 -1:-1

888:[]
  ServiceArea#1 -1:-1

889:[]
  ServiceArea#1 -1:-1

890:[]
  ServiceArea#1 -1:-1

891:[]
  ServiceArea#1 -1:-1

892:[]
  ServiceArea#1 -1:-1

893:[]
  ServiceArea#1 -1:-1

894:[]
  ServiceArea#1 -1:-1

895:[]
  ServiceArea#1 -1:-1

896:[]
  ServiceArea#1 -1:-1

897:[]
  ServiceArea#1 -1:-1

898:[]
  ServiceArea#1 -1:-1

new customer min#899
899:[]
  ServiceArea#1 899:6

900:[]
  ServiceArea#1 899:5

901:[]
  ServiceArea#1 899:4

new customer min#902
902:[902]
  ServiceArea#1 899:3

new customer min#903
903:[902, 903]
  ServiceArea#1 899:2

904:[902, 903]
  ServiceArea#1 899:1

Customer#899 leaves and his total wait time is 6
905:[903]
  ServiceArea#1 902:4

906:[903]
  ServiceArea#1 902:3

907:[903]
  ServiceArea#1 902:2

new customer min#908
908:[903, 908]
  ServiceArea#1 902:1

new customer min#909
Customer#902 leaves and his total wait time is 7
909:[908, 909]
  ServiceArea#1 903:5

910:[908, 909]
  ServiceArea#1 903:4

911:[908, 909]
  ServiceArea#1 903:3

912:[908, 909]
  ServiceArea#1 903:2

913:[908, 909]
  ServiceArea#1 903:1

Customer#903 leaves and his total wait time is 11
914:[909]
  ServiceArea#1 908:4

new customer min#915
915:[909, 915]
  ServiceArea#1 908:3

916:[909, 915]
  ServiceArea#1 908:2

917:[909, 915]
  ServiceArea#1 908:1

Customer#908 leaves and his total wait time is 10
918:[915]
  ServiceArea#1 909:2

919:[915]
  ServiceArea#1 909:1

new customer min#920
Customer#909 leaves and his total wait time is 11
920:[920]
  ServiceArea#1 915:5

921:[920]
  ServiceArea#1 915:4

922:[920]
  ServiceArea#1 915:3

new customer min#923
923:[920, 923]
  ServiceArea#1 915:2

924:[920, 923]
  ServiceArea#1 915:1

new customer min#925
Customer#915 leaves and his total wait time is 10
925:[923, 925]
  ServiceArea#1 920:7

new customer min#926
926:[923, 925, 926]
  ServiceArea#1 920:6

927:[923, 925, 926]
  ServiceArea#1 920:5

928:[923, 925, 926]
  ServiceArea#1 920:4

929:[923, 925, 926]
  ServiceArea#1 920:3

new customer min#930
930:[923, 925, 926, 930]
  ServiceArea#1 920:2

new customer min#931
931:[923, 925, 926, 930, 931]
  ServiceArea#1 920:1

new customer min#932
Customer#920 leaves and his total wait time is 12
932:[925, 926, 930, 931, 932]
  ServiceArea#1 923:2

933:[925, 926, 930, 931, 932]
  ServiceArea#1 923:1

Customer#923 leaves and his total wait time is 11
934:[926, 930, 931, 932]
  ServiceArea#1 925:4

935:[926, 930, 931, 932]
  ServiceArea#1 925:3

new customer min#936
936:[926, 930, 931, 932, 936]
  ServiceArea#1 925:2

new customer min#937
937:[926, 930, 931, 932, 936, 937]
  ServiceArea#1 925:1

Customer#925 leaves and his total wait time is 13
938:[930, 931, 932, 936, 937]
  ServiceArea#1 926:4

new customer min#939
939:[930, 931, 932, 936, 937, 939]
  ServiceArea#1 926:3

940:[930, 931, 932, 936, 937, 939]
  ServiceArea#1 926:2

941:[930, 931, 932, 936, 937, 939]
  ServiceArea#1 926:1

Customer#926 leaves and his total wait time is 16
942:[931, 932, 936, 937, 939]
  ServiceArea#1 930:2

943:[931, 932, 936, 937, 939]
  ServiceArea#1 930:1

Customer#930 leaves and his total wait time is 14
944:[932, 936, 937, 939]
  ServiceArea#1 931:7

945:[932, 936, 937, 939]
  ServiceArea#1 931:6

946:[932, 936, 937, 939]
  ServiceArea#1 931:5

new customer min#947
947:[932, 936, 937, 939, 947]
  ServiceArea#1 931:4

948:[932, 936, 937, 939, 947]
  ServiceArea#1 931:3

949:[932, 936, 937, 939, 947]
  ServiceArea#1 931:2

950:[932, 936, 937, 939, 947]
  ServiceArea#1 931:1

Customer#931 leaves and his total wait time is 20
951:[936, 937, 939, 947]
  ServiceArea#1 932:4

952:[936, 937, 939, 947]
  ServiceArea#1 932:3

953:[936, 937, 939, 947]
  ServiceArea#1 932:2

new customer min#954
954:[936, 937, 939, 947, 954]
  ServiceArea#1 932:1

new customer min#955
Customer#932 leaves and his total wait time is 23
955:[937, 939, 947, 954, 955]
  ServiceArea#1 936:7

new customer min#956
956:[937, 939, 947, 954, 955, 956]
  ServiceArea#1 936:6

957:[937, 939, 947, 954, 955, 956]
  ServiceArea#1 936:5

958:[937, 939, 947, 954, 955, 956]
  ServiceArea#1 936:4

959:[937, 939, 947, 954, 955, 956]
  ServiceArea#1 936:3

960:[937, 939, 947, 954, 955, 956]
  ServiceArea#1 936:2

961:[937, 939, 947, 954, 955, 956]
  ServiceArea#1 936:1

Customer#936 leaves and his total wait time is 26
962:[939, 947, 954, 955, 956]
  ServiceArea#1 937:6

963:[939, 947, 954, 955, 956]
  ServiceArea#1 937:5

964:[939, 947, 954, 955, 956]
  ServiceArea#1 937:4

new customer min#965
965:[939, 947, 954, 955, 956, 965]
  ServiceArea#1 937:3

new customer min#966
966:[939, 947, 954, 955, 956, 965, 966]
  ServiceArea#1 937:2

new customer min#967
967:[939, 947, 954, 955, 956, 965, 966, 967]
  ServiceArea#1 937:1

Customer#937 leaves and his total wait time is 31
968:[947, 954, 955, 956, 965, 966, 967]
  ServiceArea#1 939:3

969:[947, 954, 955, 956, 965, 966, 967]
  ServiceArea#1 939:2

970:[947, 954, 955, 956, 965, 966, 967]
  ServiceArea#1 939:1

Customer#939 leaves and his total wait time is 32
971:[954, 955, 956, 965, 966, 967]
  ServiceArea#1 947:5

972:[954, 955, 956, 965, 966, 967]
  ServiceArea#1 947:4

973:[954, 955, 956, 965, 966, 967]
  ServiceArea#1 947:3

974:[954, 955, 956, 965, 966, 967]
  ServiceArea#1 947:2

975:[954, 955, 956, 965, 966, 967]
  ServiceArea#1 947:1

Customer#947 leaves and his total wait time is 29
976:[955, 956, 965, 966, 967]
  ServiceArea#1 954:7

977:[955, 956, 965, 966, 967]
  ServiceArea#1 954:6

978:[955, 956, 965, 966, 967]
  ServiceArea#1 954:5

979:[955, 956, 965, 966, 967]
  ServiceArea#1 954:4

980:[955, 956, 965, 966, 967]
  ServiceArea#1 954:3

new customer min#981
981:[955, 956, 965, 966, 967, 981]
  ServiceArea#1 954:2

982:[955, 956, 965, 966, 967, 981]
  ServiceArea#1 954:1

new customer min#983
Customer#954 leaves and his total wait time is 29
983:[956, 965, 966, 967, 981, 983]
  ServiceArea#1 955:2

984:[956, 965, 966, 967, 981, 983]
  ServiceArea#1 955:1

Customer#955 leaves and his total wait time is 30
985:[965, 966, 967, 981, 983]
  ServiceArea#1 956:3

986:[965, 966, 967, 981, 983]
  ServiceArea#1 956:2

987:[965, 966, 967, 981, 983]
  ServiceArea#1 956:1

Customer#956 leaves and his total wait time is 32
988:[966, 967, 981, 983]
  ServiceArea#1 965:3

new customer min#989
989:[966, 967, 981, 983, 989]
  ServiceArea#1 965:2

990:[966, 967, 981, 983, 989]
  ServiceArea#1 965:1

Customer#965 leaves and his total wait time is 26
991:[967, 981, 983, 989]
  ServiceArea#1 966:3

992:[967, 981, 983, 989]
  ServiceArea#1 966:2

new customer min#993
993:[967, 981, 983, 989, 993]
  ServiceArea#1 966:1

Customer#966 leaves and his total wait time is 28
994:[981, 983, 989, 993]
  ServiceArea#1 967:2

new customer min#995
995:[981, 983, 989, 993, 995]
  ServiceArea#1 967:1

Customer#967 leaves and his total wait time is 29
996:[983, 989, 993, 995]
  ServiceArea#1 981:2

997:[983, 989, 993, 995]
  ServiceArea#1 981:1

Customer#981 leaves and his total wait time is 17
998:[989, 993, 995]
  ServiceArea#1 983:6

999:[989, 993, 995]
  ServiceArea#1 983:5

1000:[989, 993, 995]
  ServiceArea#1 983:4

new customer min#1001
1001:[989, 993, 995, 1001]
  ServiceArea#1 983:3

1002:[989, 993, 995, 1001]
  ServiceArea#1 983:2

new customer min#1003
1003:[989, 993, 995, 1001, 1003]
  ServiceArea#1 983:1

new customer min#1004
Customer#983 leaves and his total wait time is 21
1004:[993, 995, 1001, 1003, 1004]
  ServiceArea#1 989:4

1005:[993, 995, 1001, 1003, 1004]
  ServiceArea#1 989:3

1006:[993, 995, 1001, 1003, 1004]
  ServiceArea#1 989:2

1007:[993, 995, 1001, 1003, 1004]
  ServiceArea#1 989:1

Customer#989 leaves and his total wait time is 19
1008:[995, 1001, 1003, 1004]
  ServiceArea#1 993:4

1009:[995, 1001, 1003, 1004]
  ServiceArea#1 993:3

1010:[995, 1001, 1003, 1004]
  ServiceArea#1 993:2

1011:[995, 1001, 1003, 1004]
  ServiceArea#1 993:1

Customer#993 leaves and his total wait time is 19
1012:[1001, 1003, 1004]
  ServiceArea#1 995:3

new customer min#1013
1013:[1001, 1003, 1004, 1013]
  ServiceArea#1 995:2

1014:[1001, 1003, 1004, 1013]
  ServiceArea#1 995:1

Customer#995 leaves and his total wait time is 20
1015:[1003, 1004, 1013]
  ServiceArea#1 1001:2

1016:[1003, 1004, 1013]
  ServiceArea#1 1001:1

Customer#1001 leaves and his total wait time is 16
1017:[1004, 1013]
  ServiceArea#1 1003:2

1018:[1004, 1013]
  ServiceArea#1 1003:1

Customer#1003 leaves and his total wait time is 16
1019:[1013]
  ServiceArea#1 1004:2

1020:[1013]
  ServiceArea#1 1004:1

Customer#1004 leaves and his total wait time is 17
1021:[]
  ServiceArea#1 1013:6

1022:[]
  ServiceArea#1 1013:5

1023:[]
  ServiceArea#1 1013:4

1024:[]
  ServiceArea#1 1013:3

1025:[]
  ServiceArea#1 1013:2

1026:[]
  ServiceArea#1 1013:1

Customer#1013 leaves and his total wait time is 14
1027:[]
  ServiceArea#1 -1:-1

new customer min#1028
1028:[]
  ServiceArea#1 1028:5

1029:[]
  ServiceArea#1 1028:4

new customer min#1030
1030:[1030]
  ServiceArea#1 1028:3

1031:[1030]
  ServiceArea#1 1028:2

1032:[1030]
  ServiceArea#1 1028:1

Customer#1028 leaves and his total wait time is 5
1033:[]
  ServiceArea#1 1030:7

1034:[]
  ServiceArea#1 1030:6

1035:[]
  ServiceArea#1 1030:5

1036:[]
  ServiceArea#1 1030:4

1037:[]
  ServiceArea#1 1030:3

1038:[]
  ServiceArea#1 1030:2

1039:[]
  ServiceArea#1 1030:1

Customer#1030 leaves and his total wait time is 10
1040:[]
  ServiceArea#1 -1:-1

new customer min#1041
1041:[]
  ServiceArea#1 1041:3

1042:[]
  ServiceArea#1 1041:2

1043:[]
  ServiceArea#1 1041:1

new customer min#1044
Customer#1041 leaves and his total wait time is 3
1044:[]
  ServiceArea#1 1044:4

1045:[]
  ServiceArea#1 1044:3

1046:[]
  ServiceArea#1 1044:2

1047:[]
  ServiceArea#1 1044:1

new customer min#1048
Customer#1044 leaves and his total wait time is 4
1048:[]
  ServiceArea#1 1048:6

1049:[]
  ServiceArea#1 1048:5

new customer min#1050
1050:[1050]
  ServiceArea#1 1048:4

1051:[1050]
  ServiceArea#1 1048:3

new customer min#1052
1052:[1050, 1052]
  ServiceArea#1 1048:2

1053:[1050, 1052]
  ServiceArea#1 1048:1

Customer#1048 leaves and his total wait time is 6
1054:[1052]
  ServiceArea#1 1050:2

1055:[1052]
  ServiceArea#1 1050:1

Customer#1050 leaves and his total wait time is 6
1056:[]
  ServiceArea#1 1052:4

1057:[]
  ServiceArea#1 1052:3

1058:[]
  ServiceArea#1 1052:2

1059:[]
  ServiceArea#1 1052:1

Customer#1052 leaves and his total wait time is 8
1060:[]
  ServiceArea#1 -1:-1

1061:[]
  ServiceArea#1 -1:-1

new customer min#1062
1062:[]
  ServiceArea#1 1062:3

1063:[]
  ServiceArea#1 1062:2

1064:[]
  ServiceArea#1 1062:1

Customer#1062 leaves and his total wait time is 3
1065:[]
  ServiceArea#1 -1:-1

1066:[]
  ServiceArea#1 -1:-1

1067:[]
  ServiceArea#1 -1:-1

1068:[]
  ServiceArea#1 -1:-1

1069:[]
  ServiceArea#1 -1:-1

1070:[]
  ServiceArea#1 -1:-1

new customer min#1071
1071:[]
  ServiceArea#1 1071:7

1072:[]
  ServiceArea#1 1071:6

new customer min#1073
1073:[1073]
  ServiceArea#1 1071:5

1074:[1073]
  ServiceArea#1 1071:4

1075:[1073]
  ServiceArea#1 1071:3

1076:[1073]
  ServiceArea#1 1071:2

1077:[1073]
  ServiceArea#1 1071:1

Customer#1071 leaves and his total wait time is 7
1078:[]
  ServiceArea#1 1073:5

1079:[]
  ServiceArea#1 1073:4

1080:[]
  ServiceArea#1 1073:3

1081:[]
  ServiceArea#1 1073:2

1082:[]
  ServiceArea#1 1073:1

Customer#1073 leaves and his total wait time is 10
1083:[]
  ServiceArea#1 -1:-1

Total customers served = 198
Average wait time = 12.8989898989899
Longest wait time = 42
Longest queue = 8

  
  ----jGRASP: operation complete.
  **************************************/

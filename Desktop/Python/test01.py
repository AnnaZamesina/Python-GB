import math
def find_farthest_orbit(orbits):
    # my_list=[]
    # for orbit in orbits:
    #      if orbit[0]!=orbit[1]:
    #          my_list.append(math.pi*orbit[0]*orbit[1])
    eleptic_orbits=[orbit for orbit in orbits if orbit[0] != orbit[1]]
    my_list = [math.pi*orbit[0]*orbit[1] for orbit in eleptic_orbits]
    max_orbit_index = my_list.index(max(my_list))
    return eleptic_orbits[max_orbit_index]

orbits = [(1, 3), (2.5, 10), (7, 2), (6, 6), (4, 3)]
print(*find_farthest_orbit(orbits))
